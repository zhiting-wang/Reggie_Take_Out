package com.wangzt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangzt.domain.Employee;


public interface EmployeeService extends IService<Employee> {
    /*MP已经帮我们把业务层的一些基础的增删改查都已经实现了，可以直接进行使用
    * 原来的写法：
    boolean save(Book book);
    boolean update(Book book);
    boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    * */
}
