package com.example.SringAssignment.Services;

import com.example.SringAssignment.Entities.Book;
import com.example.SringAssignment.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final Repo repo;

    @Autowired
    public BookService(Repo repo) {
        this.repo = repo;
    }

    public Book saveBook(Book book) {
        return repo.save(book);
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return repo.findById(id);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = repo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setIsbn(bookDetails.getIsbn());
        return repo.save(book);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }
}