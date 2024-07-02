package com.example.libera.service.impl;

import com.example.libera.dao.BookDAO;
import com.example.libera.model.Book;
import com.example.libera.service.LibraryService;

public class LibraryServiceImpl implements LibraryService {
    private BookDAO bookDAO;

    public LibraryServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public String getBookTitle(String isbn) {
        Book book = bookDAO.getBookByIsbn(isbn);
        return book != null ? book.getTitle() : null;
    }

    @Override
    public String getAuthorName(String isbn) {
        Book book = bookDAO.getBookByIsbn(isbn);
        return book != null ? book.getAuthor() : null;
    }

    @Override
    public boolean addBook(String isbn, String title, String author) {
        Book book = new Book(isbn, title, author);
        return bookDAO.addBook(book);
    }

    @Override
    public boolean removeBook(String isbn) {
        return bookDAO.removeBook(isbn);
    }
}