package com.demo.services;

import java.util.List;
import com.demo.Category;

public interface CategoriesService {
	
	 List<Category>getData();
	 
	 Category saveData(Category cat);
	

}
