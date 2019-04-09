package com.blog.mapper;

import java.util.List;

import com.blog.pojo.BlogType;

public interface BlogTypeMapper {
	/**
	 * 查询分类列表
	 * @return
	 */
	List<BlogType> getTypeList();

	/**
	 * 根据分类id查询
	 * @param typeId
	 * @return
	 */
	BlogType getBlogTypeByTypeId(int typeId);
}
