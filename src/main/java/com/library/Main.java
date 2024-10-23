package com.library;

import com.library.model.Book;
import com.library.model.Library;
import com.library.model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Library library = new  Library();

        Student student = new Student("John", "Duran", "Student");

        Book book = new  Book("H33-555-68JK", "The president", "John F. Kenedy");
        
        library.addBook(book);

        library.addUser(student);


    }
}