package com.LibraryModel.library_list.model;

public class LibraryList {

    private int libraryNumber;
    private String libraryName;
    private String libraryAddress;
    private String libraryPhoneNumber;
    private int numberOfBooks;

    public LibraryList(int libraryNumber, String libraryName, String libraryAddress, String libraryPhoneNumber, int numberOfBooks) {
        this.libraryNumber = libraryNumber;
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.libraryPhoneNumber = libraryPhoneNumber;
        this.numberOfBooks = numberOfBooks;
    }

    public int getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(int libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    public String getLibraryPhoneNumber() {
        return libraryPhoneNumber;
    }

    public void setLibraryPhoneNumber(String libraryPhoneNumber) {
        this.libraryPhoneNumber = libraryPhoneNumber;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

}
