package com.gt.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.gt.web.entity.TableData;
import com.gt.web.entity.User;

@Controller
@RequestMapping("/table")
public class TableController {
    @RequestMapping("/index")
    public String index(Model model) {
    	return "table";
    }
    
    @RequestMapping("/data")
    @ResponseBody
    public TableData listUser0(Model model) {
    	List<User> userList = new ArrayList<User>();
    	
    	userList.add(new User(20, "张一", "男"));
    	userList.add(new User(30, "张二", "女"));
    	userList.add(new User(40, "张三", "男"));
    	userList.add(new User(50, "张四", "女"));
    	userList.add(new User(60, "张六", "男"));
    	userList.add(new User(70, "张七", "女"));
    	
    	TableData td = new TableData();
    	td.setRows(userList);
    	
        Gson gson = new Gson();
        String str = gson.toJson(td);
        //System.out.println("str:"+str);
        return td;
    }
	
}
