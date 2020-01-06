package com.liuruipeng.sharding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liuruipeng.sharding.dao.OrderDao;
import com.liuruipeng.sharding.pojo.Order;
import com.liuruipeng.sharding.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    OrderDao orderDao;

    @Override
    public void addOrder() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setPrice(BigDecimal.valueOf(0.1));
            order.setStatus("0");
            orderDao.insert(order);

        }
    }


    //执行新增后，将两库的数据各取一条，来测试
    @Override
    public List<Order> findOrder() {
      /*  List<Long> list=new ArrayList<>();
        //库1的t_order_2中
        list.add(1212979652335874049L);
        //库2的t_order_1中
        list.add(1212979650502963202L);
       List<Long> list2=new ArrayList<>();
        //库1的t_order_2中
        list2.add(419859308885311488L);
        //库2的t_order_1中
        list2.add(419859308335857665L);
        QueryWrapper<Order> queryWrapper=new QueryWrapper<>();
       *//* queryWrapper.in("order_id", list);*//*
    queryWrapper.in("order_id", list).in( "user_id",list2 );
        List<Order> orders1 = orderDao.selectList( queryWrapper );*/
        QueryWrapper<Order> queryWrapper=new QueryWrapper<>();
  /*      queryWrapper.eq( "order_id",1212979652335874049L ).eq( "user_id", 419859308335857665L);*/
        queryWrapper.eq( "order_id",1212979652335874049L );
        Order order = orderDao.selectOne(queryWrapper  );
        log.info( "order:{} ",order);
        List<Order> orders1=new ArrayList<>(  );
        orders1.add( order );

        return orders1;
    }

}
