package com.sz.repository;

import com.sz.domain.Book;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Book entity.
 */
@SuppressWarnings("unused")
public interface BookRepository extends JpaRepository<Book,Long> {

}
