package com.LibraryModel.library_list.service;

import com.LibraryModel.library_list.model.LibraryList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class LibraryService {

    static Map<Integer, LibraryList> libraryListMap = new HashMap<>();
    static List<LibraryList> list;

    public String addToLibraryList(LibraryList librarylist){
        libraryListMap.put(librarylist.getLibraryNumber(), librarylist);
        list = new ArrayList<>(libraryListMap.values());
        return "Library Data is added to Database";
    }

    public List<LibraryList> getLibrarayList(){
        return list;
    }

    public List<LibraryList> getByLibraryNumber(Integer libraryNumber){
        List<LibraryList> listByName = new ArrayList<>();
        if(null!=libraryNumber){
            if(libraryListMap.containsKey(libraryNumber)){
                listByName.add(libraryListMap.get(libraryNumber));
            }
        }
        return listByName;
    }

    public String updateLibraryList(Integer libraryNumber, LibraryList libraryList){
        if(libraryListMap.containsKey(libraryNumber)){
            libraryListMap.put(libraryNumber, libraryList);
        }else{
            return "Entered library doesn't Exist in the Library List";
        }
        return "Library List is updated";
    }

    public String deleteLibraryList(Integer libraryNumber){
        if(libraryListMap.containsKey(libraryNumber)){
            libraryListMap.remove(libraryNumber);
            return "Library is removed from database";
        }else{
            return "No such Library exists in LibraryList";
        }
    }
}
