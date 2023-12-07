package com.springboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.entity.Book;
import com.springboot.crud.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;
	
	public Book saveBook(Book book) {
		return repository.save(book);
	}
	public List<Book> saveAllBook(List<Book> books) {
		return repository.saveAll(books);
	}
	public List<Book> getAllBook() {
		return repository.findAll();
	}
	public Book getBookById(int id) {
		return repository.findById(id).orElse(null);
	}
	public Book getBookByName(String name) {
		return repository.findByName(name);
	}
	public Book update(Book book) {
		Book existingBook = repository.findById(book.getId()).orElse(null);
		existingBook.setAuthor(book.getAuthor());
		existingBook.setName(book.getName());
		return repository.save(existingBook);
	}
	public String deleteBook(int id) {
		repository.deleteById(id);
		return "Book deleted successfully";
	}

}
