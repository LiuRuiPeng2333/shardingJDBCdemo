package com.liuruipeng.sharding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.liuruipeng.sharding.dao.OrderDao;
import com.liuruipeng.sharding.pojo.Order;
import com.liuruipeng.sharding.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    OrderDao orderDao;

    @Override
    public void addOrder() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setPrice(new BigDecimal(Math.random()));
            order.setUserId(new Random().nextLong());
            order.setStatus("0");
            orderDao.insert(order);
        }
    }


    //执行新增后，将两库的数据各取一条，来测试
    @Override
    public List<Order> findOrder() {
        List<Long> list=new ArrayList<>();
        list.add(419509631564382208L);
        list.add(419509631425970177L);
        QueryWrapper<Order> queryWrapper=new QueryWrapper<>();
        queryWrapper.in("order_id", list);
        IPage<Order> orders = orderDao.selectPage( new Page<>( 2,100 ),null );
        return orders.getRecords();
    }

}
