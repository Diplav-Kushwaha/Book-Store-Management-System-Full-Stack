package com.diplav.bookstore.repository;

import com.diplav.bookstore.entity.MyBookList;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {
}