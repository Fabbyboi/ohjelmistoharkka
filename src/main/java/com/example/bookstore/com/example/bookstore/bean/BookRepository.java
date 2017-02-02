package com.example.bookstore.com.example.bookstore.bean;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public class BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByTitle(String title);

}
