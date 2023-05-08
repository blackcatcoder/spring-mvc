package com.spring.mvc.core.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.core.entities.Post;
import com.spring.mvc.core.service.PostService;

@Controller
public class IndexController {
	
	private final PostService postService;
	
	public IndexController(PostService postService){
		this.postService = postService;
	}

  @RequestMapping(value="/", method = RequestMethod.GET)
  public String getHomePage(){
	System.out.println("home");
    return "home";
  }
  
  @RequestMapping(value="/index", method = RequestMethod.GET)
  public String getIndexPage(){
	System.out.println("index");
    return "home";
  }
  
  @RequestMapping(value="/vip", method = RequestMethod.GET)
  public String getVipPage(){
	System.out.println("vip");
    return "vip";
  }
  
  
  @RequestMapping(value="/getAllPost", method = RequestMethod.GET)
  public String getAllPost(ModelMap modelMap){

	System.out.println("post");
	List<Post> posts = postService.getAllPost();
	posts.stream().forEach(System.out::println);
	modelMap.addAttribute("posts", posts);
	modelMap.addAttribute("message", "hello world");
    return "post";
  }
}
