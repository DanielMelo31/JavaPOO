package com.library.model;

public class Book{
    private String isbn; //unique book's identifier
    private String title;
    private String author;
    private boolean availability;

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.availability = false;
    }

    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbd){
        this.isbn = isbd;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
