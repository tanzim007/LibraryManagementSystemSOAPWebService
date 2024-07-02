package com.example.libera.dao.impl;

import com.example.libera.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAOImpl implements BookDAO {
    private JdbcTemplate jdbcTemplate;

    public BookDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        // implement database query to retrieve book by ISBN
    }

    @Override
    public boolean addBook(Book book) {
        // implement database query to add book
    }

    @Override
    public boolean removeBook(String isbn) {
        // implement database query to remove book
    }
}