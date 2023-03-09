package com.wangzt.dto;

import com.wangzt.domain.OrderDetail;
import com.wangzt.domain.Orders;
import lombok.Data;

import java.util.List;

@Data
public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;
}
