package com.paulo.library.repository;

import com.paulo.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository <Book, Long> {

    List<Book> findByLibraryId(Long libraryId);

}
