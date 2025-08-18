package com.diplav.bookstore.service;

import java.util.List;
import com.diplav.bookstore.entity.Book;
import org.springframework.stereotype.Service;
import com.diplav.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    public void save(Book book){
        bookRepository.save(book);
    }
    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }
    public Book getBookById(int id){
        return bookRepository.findById(id).get();
    }
    public void deleteById(int id){
        bookRepository.deleteById(id);
    }
}
