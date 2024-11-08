package com.example.tasktracker.repository;

import com.example.tasktracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

