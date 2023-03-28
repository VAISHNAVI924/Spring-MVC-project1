package com.jspiders.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//class level annotation used to request class level
public class HelloController{
	
	@RequestMapping("welcome1")  //  it is method level annotation use to request the particular web page using url
	public ModelAndView helloworld1()
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "so whaaat...???");
		return modelandview;
	}
	
	
	
}
