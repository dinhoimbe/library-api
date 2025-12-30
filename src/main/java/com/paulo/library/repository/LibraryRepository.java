package com.paulo.library.repository;

import com.paulo.library.domain.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository <Library, Long> {
}
