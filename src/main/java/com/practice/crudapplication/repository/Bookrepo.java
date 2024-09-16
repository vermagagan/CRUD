package com.practice.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.crudapplication.model.Book;
@Repository
public interface Bookrepo extends JpaRepository<Book, Long>{

}
