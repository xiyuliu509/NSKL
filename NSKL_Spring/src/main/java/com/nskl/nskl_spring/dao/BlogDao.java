package com.nskl.nskl_spring.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nskl.nskl_spring.entry.BlogContent;
import jdk.jfr.Registered;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author Honarly
 * @date 2024.06.07
 */
@Mapper
@Repository
public interface BlogDao extends BaseMapper<BlogContent> {
}