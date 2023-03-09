package com.wangzt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangzt.domain.Setmeal;
import com.wangzt.dto.SetmealDto;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);
}
