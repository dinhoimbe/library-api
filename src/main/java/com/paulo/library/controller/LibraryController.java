package com.paulo.library.controller;

import com.paulo.library.domain.Book;
import com.paulo.library.domain.Library;
import com.paulo.library.repository.BookRepository;
import com.paulo.library.repository.LibraryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    private final LibraryRepository libraryRepository;
    private final BookRepository bookRepository;

    public LibraryController(LibraryRepository libraryRepository, BookRepository bookRepository) {
        this.libraryRepository = libraryRepository;
        this.bookRepository = bookRepository;
    }

    // 1) GET /libraries
    @GetMapping
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    // 2) GET /libraries/{id}/books
    @GetMapping("/{id}/books")
    public List<Book> getBooksByLibrary(@PathVariable Long id) {
        return bookRepository.findByLibraryId(id);
    }
}

