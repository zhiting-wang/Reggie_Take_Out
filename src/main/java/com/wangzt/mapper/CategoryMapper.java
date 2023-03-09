package com.wangzt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangzt.domain.Category;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
