package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.entity.PageResult;
import com.blog.pojo.TbBlog;
import com.blog.service.BlogService;

@Controller
@RequestMapping("/blog1")
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@RequestMapping("/getBlogById")
	@ResponseBody
	public TbBlog getBlogById(int blogId) {
		TbBlog blog = blogService.getBlogById(blogId);
		return blog;
	}
	
	@RequestMapping("/getBlogList")
	@ResponseBody()
	public  PageResult getBlogList(int page,int rows) {
		return blogService.getBlogList(page,rows);
	}
	
	
	@RequestMapping("/getBlogListByTypeId")
	@ResponseBody
	public PageResult getBlogListByTypeId(int page,int rows,int typeId) {
		return blogService.getBlogListByTypeId(page,rows,typeId);
	}
	
}
