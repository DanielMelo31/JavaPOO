package com.library.model;
import java.util.ArrayList;
import java.util.List;

public class Library implements IOperations{
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    @Override
    public void addBook(Book book){
        books.add(book);
        System.out.println("New book listed: " + book.getTitle());
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println("New user registered: "+ user.getName());
    }

}
