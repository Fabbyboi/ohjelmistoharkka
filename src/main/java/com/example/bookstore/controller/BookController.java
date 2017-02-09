package com.example.bookstore.controller;

import com.example.bookstore.bean.Book;
import com.example.bookstore.bean.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/booklist")
    public String bookList(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        model.addAttribute("books", bookRepository.findAll());
        return "booklist";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        bookRepository.delete(id);
        return "redirect:../booklist";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addBook(Book book){
        bookRepository.save(book);
        return "redirect:booklist";
    }
}
