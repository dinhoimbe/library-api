package com.paulo.library;

import com.paulo.library.domain.Book;
import com.paulo.library.domain.Library;
import com.paulo.library.repository.LibraryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final LibraryRepository libraryRepository;

    public DataSeeder(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Library lib = new Library("Central Library");

        Book b1 = new Book("Clean Code", "Robert C. Martin", lib);
        Book b2 = new Book("Effective Java", "Joshua Bloch", lib);

        lib.getBooks().add(b1);
        lib.getBooks().add(b2);

        System.out.println("DataSeeder ejecutado");
        libraryRepository.save(lib);
    }
}
