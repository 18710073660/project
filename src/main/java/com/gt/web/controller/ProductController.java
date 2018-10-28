package com.gt.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.gt.web.entity.Product;
import com.gt.web.entity.TableData;
import com.gt.web.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController<E> {
	private final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	
    @RequestMapping("/index")
    public String index(Model model) {
    	return "product";
    }
    
    @RequestMapping("/list")
    @ResponseBody
    public TableData<E> list(Model model) {
    	List<Product> productList = productService.getProductList();
    	
    	TableData td = new TableData();
    	td.setRows(productList);
    	
        Gson gson = new Gson();
        String str = gson.toJson(td);
        logger.info("str:"+str);
        return td;
    }
    
}
