package com.example.bookstore;

import com.example.bookstore.bean.Book;
import com.example.bookstore.bean.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BookstoreApplication {

    private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner bookDemo(BookRepository bookRepository){
        return (args) -> {
            log.info("Save a book");
            bookRepository.save(new Book("Pekka koivinen", "921474218", "Pekan seikkailut", "1991"));
            bookRepository.save(new Book("Timo Koskinen", "214821", "Timon leikit", "1992"));

            log.info("Fetch books");
            for(Book book : bookRepository.findAll()){
                log.info(book.toString());
            }
        };
    }
}
