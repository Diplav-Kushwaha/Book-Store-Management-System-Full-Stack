package com.diplav.bookstore.controller;

import java.util.List;
import org.springframework.ui.Model;
import com.diplav.bookstore.entity.Book;
import com.diplav.bookstore.entity.MyBookList;
import com.diplav.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.diplav.bookstore.service.MyBookService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class BookController {

    @Autowired
    private BookService service;
    @Autowired
    private MyBookService myBookService;

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookRegister";
    }
    @GetMapping("/available_books")
    public ModelAndView getAllBook(){
        List<Book> list=service.getAllBook();
        return new ModelAndView("bookList", "book", list);
    }
    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        service.save(book);
        return "redirect:/available_books";
    }
    @GetMapping("/my_books")
    public String getMyBooks(Model model){
        List<MyBookList> list=myBookService.getAllMyBooks();
        model.addAttribute("book", list);
        return "myBook";
    }
    @RequestMapping("/myList/{id}")
    public String getMyList(@PathVariable("id") int id){
        Book b=service.getBookById(id);
        MyBookList mb=new MyBookList(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
        myBookService.saveMyBooks(mb);
        return "redirect:/my_books";
    }
    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id){
        service.deleteById(id);
        return "redirect:/available_books";
    }
}
