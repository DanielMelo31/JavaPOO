package com.library.service;

import java.util.List;

import com.library.model.Book;
import com.library.model.SearchException;

public interface Isearch {
    List<Book> searhTitle(String title) throws SearchException;
    List<Book> searchAuthor(String author) throws SearchException;

}
