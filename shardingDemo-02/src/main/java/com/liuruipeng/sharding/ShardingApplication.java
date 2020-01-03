package com.liuruipeng.sharding;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.liuruipeng.sharding.dao")
@SpringBootApplication
/**
 * Sharding-JDBC 整合mybatis-plus 一主一从 读写分离
 *      mysql数据库先进行主从同步配置
 */
public class ShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run( ShardingApplication.class, args );
    }

}
