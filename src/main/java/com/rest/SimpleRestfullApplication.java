package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.entities.Book;
import com.rest.service.BookService;

@SpringBootApplication
public class SimpleRestfullApplication implements CommandLineRunner {
@Autowired
BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(SimpleRestfullApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.setAuthor("none");
		b.setBookname("java code starter");
		b.setPrice(10);
		bookService.createBook(b);

		Book b2=new Book();
		
		b2.setAuthor("pivotal");
		b2.setBookname("java spring");
		b2.setPrice(22);
		bookService.createBook(b2);
		
		
		
	}

}
