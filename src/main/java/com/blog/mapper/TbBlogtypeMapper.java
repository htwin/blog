package com.blog.mapper;

import com.blog.pojo.TbBlogtype;
import com.blog.pojo.TbBlogtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBlogtypeMapper {
    int countByExample(TbBlogtypeExample example);

    int deleteByExample(TbBlogtypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(TbBlogtype record);

    int insertSelective(TbBlogtype record);

    List<TbBlogtype> selectByExample(TbBlogtypeExample example);

    TbBlogtype selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") TbBlogtype record, @Param("example") TbBlogtypeExample example);

    int updateByExample(@Param("record") TbBlogtype record, @Param("example") TbBlogtypeExample example);

    int updateByPrimaryKeySelective(TbBlogtype record);

    int updateByPrimaryKey(TbBlogtype record);
}