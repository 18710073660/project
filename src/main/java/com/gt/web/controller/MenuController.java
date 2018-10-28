package com.gt.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/menu")
public class MenuController {
	private final Logger logger = LoggerFactory.getLogger(MenuController.class); 
	
    @RequestMapping("/index")
    public String index(Model model) {
    	return "menu";
    }
    
    @RequestMapping("/baidu")
    public ModelAndView baidu(Model model) {
    	return new ModelAndView(new RedirectView("http://www.baidu.com"));
    }
    
    @RequestMapping("/jd")
    public ModelAndView jd(Model model) {
    	return new ModelAndView(new RedirectView("http://www.jd.com"));
    }
    
    @RequestMapping("/taobao")
    public ModelAndView taobao(Model model) {
    	return new ModelAndView(new RedirectView("http://www.taobao.com"));
    }
    
}
