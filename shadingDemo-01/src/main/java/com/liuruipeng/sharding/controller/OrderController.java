package com.liuruipeng.sharding.controller;



import com.liuruipeng.sharding.pojo.Order;
import com.liuruipeng.sharding.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping(value = "/add")
    public void addOrder() {
        orderService.addOrder();
    }

    @GetMapping(value = "/find")
    public void findOrder() {
        List<Order> order = orderService.findOrder();
        log.info( "查询结果："+order.size() );
    }

}
