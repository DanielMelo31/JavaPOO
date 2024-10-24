package com.library.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.library.service.IOperations;
import com.library.service.Isearch;

public class Library implements IOperations, Isearch{
    private List<Book> books;
    private List<User> users;
    private List<LoanHistory> loanHistory;


    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.loanHistory = new ArrayList<>();
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

    public void loanBook(Book book, User user){
        if (!book.getAvailability()) {
            book.setAvailability(true);
            loanHistory.add(new LoanHistory(book, user, new Date()));
           
            System.out.println("Book loaned: "+book.getTitle() + " to " + user.getFullName());
        } else {
            System.out.println("This book is not available");
        }
    }

    public void returnBook(Book book, User user){
        if (book.getAvailability()) {
            book.setAvailability(false);
            for (LoanHistory loanedSingleHistory : loanHistory) {
                if(loanedSingleHistory.getBook().equals(book) && loanedSingleHistory.getUser().equals(user) 
                    && loanedSingleHistory.getReturnDate() == null){
                        loanedSingleHistory.setReturnDate(new Date());
                        System.out.println("Book " + book.getTitle() + " returned");
                        break;
                }
            }
            
        } else {
            System.out.println("Not returned yet.");
        }
    }
    
    @Override
    public List<Book> searhTitle(String title) throws SearchException{
        List<Book> titleList = new ArrayList();

        for (Book book : books){
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())){
                titleList.add(book);
                System.out.println("Found: "+book.getTitle());
            }             
        }
        if (titleList.isEmpty()) {
            throw new SearchException("Book: "+title+" not found.");
        }

        return titleList;
    }

    @Override
    public List<Book> searchAuthor(String author) throws SearchException {
        ArrayList<Book> authorList = new ArrayList();

        for (Book book : books) {
            if(book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                authorList.add(book);
                System.out.println("Found: "+book.getAuthor());
            }
        }
        if (authorList.isEmpty()) {
            throw new SearchException("Author: "+author+" not found.");
        }
        return authorList;

    }
}