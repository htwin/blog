package com.blog.service;

import java.util.List;

import com.blog.pojo.Navigation;

public interface NavigationService {
	/**
	 * 查询所有导航信息
	 * @return
	 */
	List<Navigation> findAll();
}
