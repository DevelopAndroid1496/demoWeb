package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Category;
import com.demo.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl implements CategoriesService {
	
	@Autowired
	private CategoriesRepository repository;

	@Override
	public List<Category> getData() {
		return repository.findAll();
	}

	@Override
	public Category saveData(Category cat) {
		return repository.save(cat);
		
	}


}
