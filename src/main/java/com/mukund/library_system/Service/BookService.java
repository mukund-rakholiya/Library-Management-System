package com.mukund.library_system.Service;

import com.mukund.library_system.Model.Book;
import com.mukund.library_system.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> searchBookByAuthor(String author) {
        return bookRepository.findByAuthorContaining(author);
    }

    public List<Book> searchBookByTitle(String title) {
        return bookRepository.findByTitleContaining(title);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
