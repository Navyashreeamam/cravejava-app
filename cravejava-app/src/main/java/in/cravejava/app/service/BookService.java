package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks() { return bookRepository.findAll(); }

    public Book saveBook(Book book) { return bookRepository.save(book); }

    public List<Book> findBooksByAuthorId(Long authorId) { return bookRepository.findBooksByAuthorId(authorId); }
}