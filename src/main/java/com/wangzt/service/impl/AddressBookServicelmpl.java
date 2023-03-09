package com.wangzt.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangzt.domain.AddressBook;
import com.wangzt.mapper.AddressBookMapper;
import com.wangzt.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServicelmpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
