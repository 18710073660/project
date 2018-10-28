package com.gt.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.gt.web.entity.Echarts;
import com.gt.web.entity.Product;
import com.gt.web.entity.Series;
import com.gt.web.entity.TableData;
import com.gt.web.entity.User;
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
    
    @RequestMapping("/toMyEcharts")
    public String toMyEcharts(Model model,@RequestParam("param") String param) {
    	model.addAttribute("param", param);
    	return "productEcharts";
    }
    
    @RequestMapping("/prepareDataForEcharts")
    @ResponseBody
    public Echarts prepareDataForEcharts(Model model,@RequestParam("param") String param) {
    	List<String> list = Arrays.asList(param.split(","));
    	List<Product> productList = new ArrayList<Product>();
    	for (String str : list) {
    		productList.add(productService.getProductById(str));
		}
    	
    	
    	List<String> legend = new ArrayList<String>();
    	legend.add("销量折线图");
    	
    	List<String> axisList = new ArrayList<String>();
    	List<Integer> series = new ArrayList<Integer>();
    	for (Product product : productList) {
    		axisList.add(product.getName());
			series.add(product.getNumber());
		}
    	
        List<Series> seriesList = new ArrayList<Series>();
        seriesList.add(new Series("销量", "line", new ArrayList<Integer>(series)));
        Echarts echarts = new Echarts(legend, axisList, seriesList);
        Gson gson = new Gson();
        String str = gson.toJson(echarts);
        logger.info("str:"+str);
        
    	return echarts;
    }
    
}
