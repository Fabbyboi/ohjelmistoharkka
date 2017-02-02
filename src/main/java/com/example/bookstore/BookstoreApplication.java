package com.example.bookstore;

import com.example.bookstore.com.example.bookstore.bean.Book;
import com.example.bookstore.com.example.bookstore.bean.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = Logger.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository repository){
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("JMS", "9854879598", "Book of plot", "1999"));

			log.info("fetch all books");
			for(Book book : repository.findAll()){
				log.info(book.toString());
			}
		};
	}

	@Bean
    public CommandLineRunner bookDemo(BookRepository repository){
	    return (args) -> {


        }
    }
}
