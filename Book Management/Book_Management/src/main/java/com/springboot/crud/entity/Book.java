package com.springboot.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	@GeneratedValue
	private int id;
	private String Author;
	private String name;
	
	public Book() {
	}

	public Book(int id, String author, String name) {
		this.id = id;
		Author = author;
		this.name = name;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", Author=" + Author + ", name=" + name + "]";
	}
	
	
}
