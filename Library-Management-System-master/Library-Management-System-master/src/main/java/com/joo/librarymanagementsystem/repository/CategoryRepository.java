package com.joo.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joo.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
