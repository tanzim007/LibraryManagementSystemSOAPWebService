package com.example.libera.dao;

import com.example.libera.model.Book;

public interface BookDAO {
    Book getBookByIsbn(String isbn);
    boolean addBook(Book book);
    boolean removeBook(String isbn);
}