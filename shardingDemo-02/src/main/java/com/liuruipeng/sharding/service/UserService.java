package com.liuruipeng.sharding.service;




import com.liuruipeng.sharding.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 新增订单
     *
     */
    void addUser();

    /**
     * 查询
     */
    List<User> findUser();
}
