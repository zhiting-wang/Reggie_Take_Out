package com.wangzt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangzt.domain.Orders;

public interface OrderService extends IService<Orders> {
    void submit(Orders orders);
}
