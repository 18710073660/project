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
import com.gt.web.entity.Series;
import com.gt.web.entity.TableData;
import com.gt.web.entity.User;
import com.gt.web.service.UserService;

@Controller
@RequestMapping("/table")
public class TableController {
	private final Logger logger = LoggerFactory.getLogger(TableController.class); 
	@Autowired
	private UserService userService;
	
    @RequestMapping("/index")
    public String index(Model model) {
    	return "table";
    }
    
    @RequestMapping("/list")
    @ResponseBody
    public TableData listUser0(Model model) {
    	List<User> userList = userService.getUserList();
    	
    	TableData td = new TableData();
    	td.setRows(userList);
    	
        Gson gson = new Gson();
        String str = gson.toJson(td);
        logger.info("str:"+str);
        return td;
    }
    
    @RequestMapping("/toMyEcharts")
    public String toMyEcharts(Model model,@RequestParam("param") String param) {
    	model.addAttribute("param", param);
    	return "userEcharts";
    }
    
    @RequestMapping("/prepareDataForEcharts")
    @ResponseBody
    public Echarts prepareDataForEcharts(Model model,@RequestParam("param") String param) {
    	List<String> list = Arrays.asList(param.split(","));
    	List<User> userList = new ArrayList<User>();
    	for (String str : list) {
    		userList.add(userService.getUserById(str));
		}
    	
    	
    	List<String> legend = new ArrayList<String>();
    	legend.add("年龄折线图");
    	
    	List<String> axisList = new ArrayList<String>();
    	List<Integer> series = new ArrayList<Integer>();
    	for (User user : userList) {
    		axisList.add(user.getName());
			series.add(user.getAge());
		}
    	
        List<Series> seriesList = new ArrayList<Series>();
        seriesList.add(new Series("年龄", "line", new ArrayList<Integer>(series)));
        Echarts echarts = new Echarts(legend, axisList, seriesList);
        Gson gson = new Gson();
        String str = gson.toJson(echarts);
        logger.info("str:"+str);
        
    	return echarts;
    }
	
}
