package com.gt.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.web.dao.ProductDao;
import com.gt.web.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public List<Product> getProductList(){
		return productDao.getProductList();
	}
	
	
	public Product getProductById(String id){
		return productDao.getProductById(id);
	}

}
