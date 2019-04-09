package com.blog.service;

import java.util.List;

import com.blog.pojo.BlogType;

public interface BlogTypeService {
	/**
	 * 查询分类列表
	 * @return
	 */
	public List<BlogType> getTypeList();

	/**
	 * 根据分类id查询
	 * @param typeId
	 * @return
	 */
	public BlogType getBlogTypeByTypeId(int typeId);

}
