package com.training.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	private static final Logger logger = Logger.getLogger(EmployeeController.class);
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView find() {
		logger.debug("Find Method()");
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("message", "Hello Spring MVC");
		return mv;
	}

}
