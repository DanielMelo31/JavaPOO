package com.library.model;

import java.util.Date;

public class LoanHistory{
    private Book book;
    private User user;
    private Date loandDate;
    private Date returnDate;

    public LoanHistory(Book book, User user, Date loanDate) {
        this.book = book;
        this.user = user;
        this.loandDate = loanDate;
        this.returnDate = null;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getLoandDate() {
        return loandDate;
    }

    public void setLoandDate(Date loandDate) {
        this.loandDate = loandDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
   
}
