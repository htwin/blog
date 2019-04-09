package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.mapper.NavigationMapper;
import com.blog.pojo.Navigation;
import com.blog.service.NavigationService;

@Service
public class NavigationServiceImpl implements NavigationService {

	@Autowired
	private NavigationMapper navigationMapper;
	
	public List<Navigation> findAll() {
		return navigationMapper.findAll();
	}
	
}
