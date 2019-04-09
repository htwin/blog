package com.blog.mapper;

import java.util.List;

import com.blog.pojo.Navigation;

public interface NavigationMapper {
	/**
	 * 查出所有导航
	 * @return
	 */
	List<Navigation> findAll();
}
