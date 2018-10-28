package com.gt.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gt.web.entity.Product;

@Mapper
public interface ProductDao {
	
	public List<Product> getProductList();
	
	public Product getProductById(String id);
	
}
