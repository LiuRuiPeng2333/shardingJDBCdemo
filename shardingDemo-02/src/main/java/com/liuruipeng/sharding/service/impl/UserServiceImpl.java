package com.liuruipeng.sharding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.liuruipeng.sharding.dao.UserDao;
import com.liuruipeng.sharding.pojo.User;
import com.liuruipeng.sharding.service.UserService;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;


    @Override
    public void addUser() {

        for (int i = 0; i <10 ; i++) {
            User user=new User();
            user.setFullname("天天");
            user.setUserType("1");
            userDao.insert(user);
        }

    }

    @Override
    public List<User> findUser() {

        IPage<User> user = userDao.selectPage( new Page<>( 2,100 ),null );

        return user.getRecords();

    }
}
