package com.gt.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {
	private final Logger logger = LoggerFactory.getLogger(MenuController.class); 
	
    @RequestMapping("/index")
    public String index(Model model) {
    	return "menu";
    }
    
}
