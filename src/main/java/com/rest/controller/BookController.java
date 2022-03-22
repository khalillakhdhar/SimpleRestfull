package com.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Book;
import com.rest.service.BookService;

@RestController
public class BookController {
@Autowired
BookService booksApi;
@GetMapping("")
public String sayhi()
{
	
return "hello books";

}
@GetMapping("books")
public List<Book> getAllBooks()
{
	return booksApi.showAll();
	
}
@GetMapping("/books/{bookid}")
public Book getBookid(@PathVariable int bookid) // le paramétre {}=> valeur de pathVariable
{
	return booksApi.searchBook(bookid).get();

}
@PostMapping("books")
public Book saveOne(@RequestBody @Valid Book book) // ajoute uniquement un book valid (@Valid)
// @RequestBody recupére tout l'objet JSON ( une instance de book)
{
	return booksApi.createBook(book);

}
	
	
	
}
