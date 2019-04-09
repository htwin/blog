package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.pojo.BlogType;
import com.blog.service.BlogTypeService;

@Controller
@RequestMapping("/blogType")
public class BlogTypeController {

	@Autowired
	private BlogTypeService blogTypeService;
	
	@RequestMapping("/getTechnologyTypeList")
	@ResponseBody
	public List<BlogType> getTechnologyTypeList(){
		List<BlogType> typeList = blogTypeService.getTypeList();
		return typeList;
	}
	
	@RequestMapping("/getBlogTypeByTypeId")
	@ResponseBody
	public BlogType getBlogTypeByTypeId(int typeId){
		BlogType blogType = blogTypeService.getBlogTypeByTypeId(typeId);
		return blogType;
	}
	
}
