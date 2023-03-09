package com.wangzt.dto;

import com.wangzt.domain.Setmeal;
import com.wangzt.domain.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    // 套餐里的菜品列表
    private List<SetmealDish> setmealDishes;

    //套餐分类名称
    private String categoryName;
}
