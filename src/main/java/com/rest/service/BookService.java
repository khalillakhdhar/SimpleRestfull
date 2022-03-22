package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entities.Book;
import com.rest.repository.BookRepository;

@Service
public class BookService {
@Autowired
BookRepository bookrepo;
public List<Book> showAll()
{
return (List<Book>) bookrepo.findAll();	
}
public Book createBook(Book book)
{
return bookrepo.save(book);	
}
public void deleteBook(int id)
{
bookrepo.deleteById(id);	
}
public Optional<Book> searchBook(int id)
{
return bookrepo.findById(id);	
}

}
