package com.gt.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.gt.web.entity.Echarts;
import com.gt.web.entity.Series;

@Controller
@RequestMapping("/data")
public class EchartsController {
    @RequestMapping("/test")
    public String  listUser00(Model model) {
    	return "test";
    }
	
    @RequestMapping("/hello")
    @ResponseBody
    public Echarts  listUser0(Model model) {
    	List<String> legend = new ArrayList<String>();
    	legend.add("测试中...");
    	
    	List<String> axis = new ArrayList<String>();
    	axis.add("衬衫2");
    	axis.add("羊毛衫");
    	axis.add("雪纺衫");
    	axis.add("裤子");
    	axis.add("高跟鞋");
    	axis.add("袜子");
    	axis.add("拖鞋");
    	
    	
        List<Series> series = new ArrayList<Series>();
        series.add(new Series("销量", "line", new ArrayList<Integer>(Arrays.asList(5, 20, 90, 10, 10, 20, 33))));
        series.add(new Series("销量", "line", new ArrayList<Integer>(Arrays.asList(15, 30, 20, 40, 70, 10, 13))));
        Echarts echarts = new Echarts(legend, axis, series);
        Gson gson = new Gson();
        String str = gson.toJson(echarts);
        System.out.println("str:"+str);
        return echarts;
    }
    
}
