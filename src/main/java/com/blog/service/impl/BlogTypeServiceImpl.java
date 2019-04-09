package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.mapper.BlogTypeMapper;
import com.blog.pojo.BlogType;
import com.blog.service.BlogTypeService;
@Service
public class BlogTypeServiceImpl implements BlogTypeService {

	@Autowired
	private BlogTypeMapper blogTypeMapper;
	
	public List<BlogType> getTypeList() {
		return blogTypeMapper.getTypeList();
	}

	public BlogType getBlogTypeByTypeId(int typeId) {
		// TODO Auto-generated method stub
		return blogTypeMapper.getBlogTypeByTypeId(typeId);
	}

}
