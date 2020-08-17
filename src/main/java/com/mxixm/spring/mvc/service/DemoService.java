package com.mxixm.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 声明为Spring的Service组件，可以被Spring框架自动扫描到并作为Bean注册到Spring容器中
 * @author zhangx511
 */
@Service
public class DemoService {

    /**
     * 引入数据库操作模版，该Bean在 spring-servlet.xml 中声明
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 注解声明开启事务管理
     * @param id
     * @return
     */
    @Transactional
    public String getName(int id) {

        /**
         * 查询数据库中以id值为参数的记录，并返回name字段
         */
        return jdbcTemplate.queryForObject("select name from user where id = ?", String.class, id);
    }

}
