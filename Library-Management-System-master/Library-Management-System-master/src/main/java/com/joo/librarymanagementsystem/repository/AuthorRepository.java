package com.joo.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joo.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
