(1)创建数据库
#创建数据库user_db
CREATE DATABASE `user_db` CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_general_ci';

(2)在user_db中创建t_user表
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
                        `user_id` bigint(20) NOT NULL COMMENT '用户id',
                        `fullname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
                        `user_type` char(1) DEFAULT NULL COMMENT '用户类型',
                        PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;