package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.PageResult;
import com.blog.mapper.TbBlogMapper;
import com.blog.pojo.TbBlog;
import com.blog.pojo.TbBlogExample;
import com.blog.pojo.TbBlogExample.Criteria;
import com.blog.service.BlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private TbBlogMapper tbBlogMapper;
	
	public TbBlog getBlogById(Integer id) {
		return tbBlogMapper.selectByPrimaryKey(id);
	}

	public PageResult getBlogList(int page,int rows) {
		
		PageHelper.startPage(page,rows,"createDate desc");
		List<TbBlog> blogList = tbBlogMapper.selectByExample(null);
		PageInfo<TbBlog> pageInfo = new PageInfo<TbBlog>(blogList);
		PageResult pageResult = new PageResult();
		pageResult.setCurrentPage(pageInfo.getPageNum());
		pageResult.setTotal((int)pageInfo.getTotal());
		pageResult.setList(blogList);
		pageResult.setPageNum(pageInfo.getPages());
		return pageResult;
	}

	public PageResult getBlogListByTypeId(int page,int rows,Integer typeId) {
		PageHelper.startPage(page,rows,"createDate desc");
		TbBlogExample example = new TbBlogExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeidEqualTo(typeId);
		List<TbBlog> blogList = tbBlogMapper.selectByExample(example );
		PageInfo<TbBlog> pageInfo = new PageInfo<TbBlog>(blogList);
		PageResult pageResult = new PageResult();
		pageResult.setCurrentPage(pageInfo.getPageNum());
		pageResult.setTotal((int)pageInfo.getTotal());
		pageResult.setList(blogList);
		pageResult.setPageNum(pageInfo.getPages());
		return pageResult;
	}

}
