package com.wangzt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangzt.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
