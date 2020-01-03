package com.liuruipeng.sharding.controller;



import com.liuruipeng.sharding.pojo.User;
import com.liuruipeng.sharding.service.UserService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/add")
    public void addOrder() {
        userService.addUser();
    }

    @GetMapping(value = "/find")
    public void findOrder() {
        List<User> order = userService.findUser();
        log.info( "查询结果："+order.size() );
    }
}
