package com.wangzt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangzt.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    /**   继承 BaseMapper<Employee>即可
     * 原来的写法：
     *     @Select("select * from tbl_book where id=#{id}")
     *     Book getById(Integer id);
     *     @Select("select * from tbl_book")
     *     List<Book> getAll();
     *     @Update("update tbl_book set type=#{type}, `name`=#{name}, `description`=#{description} where id=#{id}")
     *     int update(Book book);
     *     @Delete("delete from tbl_book where id=#{id}")
     *     int delete(Integer id);
     *     @Insert("insert into tbl_book values (null, #{type}, #{name}, #{description})")
     *     int save(Book book);
     */
}
