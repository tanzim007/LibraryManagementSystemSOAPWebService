package com.example.libera.service;

import javax.jws.WebService;

@WebService
public interface LibraryService {
    String getBookTitle(String isbn);
    String getAuthorName(String isbn);
    boolean addBook(String isbn, String title, String author);
    boolean removeBook(String isbn);
}