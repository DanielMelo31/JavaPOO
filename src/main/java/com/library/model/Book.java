package com.library.model;

public class Book{
    private String isbn; //unique book's identifier
    private String title;
    private String author;
    private boolean status;

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.status = false;
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
    
    public boolean getStatus() {
        return status;
    }


    public void bookOnLoan() {
        if (!status) {
            status = true;
        }
        else {
            System.out.println("The book is on loan.");
        };
    }

    public void returnBook() {
        if (status){
            status = false;
            System.out.println("The book has been returned.");
        } else {
            System.out.println("The book is due for return");
        }
    }    
}
