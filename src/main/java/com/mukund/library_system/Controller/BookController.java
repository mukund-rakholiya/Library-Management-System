package com.mukund.library_system.Controller;

import com.mukund.library_system.Model.Book;
import com.mukund.library_system.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/{title}")
    public List<Book> searchBookByTitle(@PathVariable String title) {
        return bookService.searchBookByTitle(title);
    }

    @GetMapping("/{author}")
    public List<Book> searchBookByAuthor(@PathVariable String author) {
        return bookService.searchBookByAuthor(author);
    }

    @PostMapping
    public Book createUser(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
