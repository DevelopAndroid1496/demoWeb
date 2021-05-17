package com.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Category;
import com.demo.services.CategoriesService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping({"/categories"})

public class CategoriesController {
	
	@Autowired
	CategoriesService service;
	
	@GetMapping
	public List<Category> getData(){
		return service.getData();	
	}
	
	@PostMapping
	public Category saveCategory(@RequestBody Category cat) {
		return service.saveData(cat);
	}
	

}
