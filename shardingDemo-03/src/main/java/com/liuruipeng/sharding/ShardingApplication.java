package com.liuruipeng.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sharding-JDBC 整合mybatis-plus 水平分库、分表
 */
@MapperScan("com.liuruipeng.sharding.dao")
@SpringBootApplication
public class ShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run( ShardingApplication.class, args );
    }

}
