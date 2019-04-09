package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.pojo.Navigation;
import com.blog.service.NavigationService;

@Controller
@RequestMapping("/navigation")
public class NavigationController {

	@Autowired
	private NavigationService navigationService;
	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Navigation> findAll(){
		return navigationService.findAll();
	}
}
