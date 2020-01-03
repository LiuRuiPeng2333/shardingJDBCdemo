package com.liuruipeng.sharding.service;



import com.liuruipeng.sharding.pojo.Order;

import java.util.List;

public interface OrderService {
    /**
     * 新增订单
     *
     */
    void addOrder();

    /**
     * 查询
     */
    List<Order> findOrder();
}
