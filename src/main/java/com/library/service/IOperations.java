package com.library.service;

import com.library.model.Book;
import com.library.model.User;

public interface IOperations {
    void addBook(Book book);
    void addUser(User user);
}