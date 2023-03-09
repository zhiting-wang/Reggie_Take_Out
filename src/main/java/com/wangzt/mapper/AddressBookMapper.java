package com.wangzt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangzt.domain.AddressBook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
