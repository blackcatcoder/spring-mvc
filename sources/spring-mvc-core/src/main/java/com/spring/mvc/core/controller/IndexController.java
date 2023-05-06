package com.spring.mvc.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

  @RequestMapping(value="/", method = RequestMethod.GET)
  public String getHomePage(){
	System.out.println("home");
    return "home";
  }
  
  @RequestMapping(value="/vip", method = RequestMethod.GET)
  public String getVipPage(){
	System.out.println("vip");
    return "vip";
  }

}
