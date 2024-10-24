package com.library;

import com.library.model.Book;
import com.library.model.Library;
import com.library.model.SearchException;
import com.library.model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Library library = new  Library();

        Student student = new Student("John", "Duran", "Student");

        Book book = new  Book("H33-555-68JK", "The president", "John F. Kenedy");
        Book book1 = new  Book("H45-775-HY6", "The alchemist", "Paulo Coelho");
        Book book2 = new Book("H08-945-WS88", "The richest man in Babylon", "George Samuel Clason");
        
        
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);

        //library.addUser(student);
        try {

            library.searhTitle("BabYLon");
        } catch(SearchException e) {
            System.out.println(e.getMessage());
        }

        try {
            library.searchAuthor("PauLo");
            
        } catch (SearchException e) {
            System.out.println(e.getMessage());
        }

    }
}