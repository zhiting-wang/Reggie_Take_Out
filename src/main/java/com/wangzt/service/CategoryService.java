package com.wangzt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangzt.domain.Category;

public interface CategoryService extends IService<Category> {
    void remove(Long id);
}
