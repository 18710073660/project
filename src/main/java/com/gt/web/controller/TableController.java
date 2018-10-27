package com.gt.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.gt.web.entity.TableData;
import com.gt.web.entity.User;
import com.gt.web.service.UserService;

@Controller
@RequestMapping("/table")
public class TableController {
	
	@Autowired
	private UserService userService;
	
	
    @RequestMapping("/index")
    public String index(Model model) {
    	return "table";
    }
    
    @RequestMapping("/data")
    @ResponseBody
    public TableData listUser0(Model model) {
    	List<User> userList = userService.getUserList();
    	
    	TableData td = new TableData();
    	td.setRows(userList);
    	
        Gson gson = new Gson();
        String str = gson.toJson(td);
        System.out.println("str:"+str);
        return td;
    }
	
}
