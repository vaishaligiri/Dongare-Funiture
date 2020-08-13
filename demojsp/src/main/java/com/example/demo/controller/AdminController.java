package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.MainTypeModel;
import com.example.demo.service.MainTypeService;

@Controller
public class AdminController {

	@Autowired
	MainTypeService mainTypeService;

	@RequestMapping("/")
	public String adminMaster() {
		return "AdminMaster";
	}

	@RequestMapping("/MainType")
	public String mainType() {
	
		return "MainType";
	}
	@RequestMapping(value="/SaveMainType",method=RequestMethod.POST)
	public ModelAndView saveMainType(MainTypeModel model)
	{
		 ModelAndView m=new ModelAndView();
		 
		boolean b=mainTypeService.isAddMainType(model);
		  if(b)
		  {
			m.addObject("msg","MainType Added Successfully............"); 
		  }
		  else
		  {
			 m.addObject("msg","Some problem is there....................");
		  }
		  m.setViewName("MainType");
		return m;
	}
}
