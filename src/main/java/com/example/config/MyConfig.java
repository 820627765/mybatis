package com.example.config;

import org.apache.tomcat.dbcp.dbcp.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 整合mybatis
 * 目的：1，spring管理所有组件。包括 mapper 接口的实现类对象(代理对象)
 * 2，利用spring来管理事务
 * 整合步骤：
 */
@Configuration
@ImportResource(locations = "classpath:applicationContext.xml")
public class MyConfig {
    /**
     * 整合第一步：数据源
     *
     * @return
     * @throws Exception
     */
    @Bean
    public DataSource dataSource() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("username", "root");
        properties.setProperty("password", "znbznb");
        properties.setProperty("url", "jdbc:mysql://localhost:3306/mybatis?useUnicode=true&amp;characterEncoding=utf-8&amp;useSSL=false&amp;serverTimezone=UTC");
        properties.setProperty("driverClassName", "com.mysql.jdbc.Driver");
        return BasicDataSourceFactory.createDataSource(properties);
    }


}
