package com.xapplication.final_project.repository;

import com.xapplication.final_project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categoryrepository extends JpaRepository<Category, Integer> {
    Category findByCategoryName(String categoryName);
}
