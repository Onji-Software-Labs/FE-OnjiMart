package com.sattva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sattva.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
