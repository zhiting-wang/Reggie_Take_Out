package com.wangzt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangzt.domain.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
