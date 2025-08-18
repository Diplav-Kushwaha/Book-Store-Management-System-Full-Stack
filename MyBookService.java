package com.diplav.bookstore.service;

import java.util.List;
import com.diplav.bookstore.entity.MyBookList;
import org.springframework.stereotype.Service;
import com.diplav.bookstore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class MyBookService {

    @Autowired
    private MyBookRepository myBookRepository;
    public void saveMyBooks(MyBookList book){
        myBookRepository.save(book);
    }
    public List<MyBookList> getAllMyBooks(){
        return myBookRepository.findAll();
    }
    public void deleteById(int id){
        myBookRepository.deleteById(id);
    }
}
