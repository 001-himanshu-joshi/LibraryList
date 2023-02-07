package com.LibraryModel.library_list.controller;

import com.LibraryModel.library_list.model.LibraryList;
import com.LibraryModel.library_list.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library_list")
public class LibraryController {
    @Autowired
    private final LibraryService libraryService;
    public LibraryController(LibraryService libraryService){
        this.libraryService = libraryService;
    }

    @PostMapping("/postingLibraryList")
    public String addToLibraryList(@RequestBody LibraryList librarylist){
        return libraryService.addToLibraryList(librarylist);
    }

    @GetMapping("/getLibraryList")
    public List<LibraryList> getLibraryList(){
        return libraryService.getLibrarayList();
    }

    @GetMapping("/getByLibraryNumber/{libraryNumber}")
    public List<LibraryList> getByLibraryName(@PathVariable Integer libraryNumber){
        return libraryService.getByLibraryNumber(libraryNumber);
    }

    @PutMapping("/updateLibrary/{libraryNumber}")
    public String updateByNumber(@PathVariable Integer libraryNumber, @RequestBody LibraryList libraryList){
       return libraryService.updateLibraryList(libraryNumber, libraryList);
    }

    @DeleteMapping("/deleteLibrary/{libraryNumber}")
    public String deleteLibrary(@PathVariable Integer libraryNumber){
        return libraryService.deleteLibraryList(libraryNumber);
    }

}
