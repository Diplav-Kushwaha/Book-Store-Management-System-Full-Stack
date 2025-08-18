package com.diplav.bookstore.controller;

import org.springframework.stereotype.Controller;
import com.diplav.bookstore.service.MyBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MyBookController {

    @Autowired
    private MyBookService myBookService;

    @GetMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable int id) {
        myBookService.deleteById(id);
        return "redirect:/my_books";
    }
}
