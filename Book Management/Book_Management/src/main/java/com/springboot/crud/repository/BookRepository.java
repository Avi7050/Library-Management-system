package com.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	Book findByName(String name);

}
