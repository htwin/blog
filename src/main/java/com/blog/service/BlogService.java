package com.blog.service;


import com.blog.entity.PageResult;
import com.blog.pojo.TbBlog;

public interface BlogService {
	/**
	 * 根据博客id查询
	 * @param id
	 * @return
	 */
	TbBlog getBlogById(Integer id);
	/**
	 * 获取博客列表
	 * @return
	 */
	PageResult getBlogList(int page,int rows);
	
	/**
	 * 根据类别查询博客列表
	 * @param id
	 * @return
	 */
	PageResult getBlogListByTypeId(int page,int rows,Integer id);
}
 