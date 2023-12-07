package com.springboot.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.entity.Book;
import com.springboot.crud.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService service;
	
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	@PostMapping("/saveBooks")
	public List<Book> saveAllBook(@RequestBody List<Book> books) {
		return service.saveAllBook(books);
	}
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return service.getAllBook();
	}
	@GetMapping("/book/{isbn}")
	public Book getBookById(@PathVariable int id){
		return service.getBookById(id);
	}
	@GetMapping("/book/{name}")
	public Book getBookByName(@PathVariable String name){
		return service.getBookByName(name);
	}
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) {
		return service.update(book);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		return service.deleteBook(id);
	}
	

}
