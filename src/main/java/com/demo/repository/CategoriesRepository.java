package com.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.demo.Category;

public interface CategoriesRepository extends Repository<Category,Integer> {
	
	List<Category> findAll();
	
	Category save(Category c);

}
