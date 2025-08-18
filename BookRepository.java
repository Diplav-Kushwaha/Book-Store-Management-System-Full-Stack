package com.diplav.bookstore.repository;

import com.diplav.bookstore.entity.Book;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
