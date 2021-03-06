package com.example;

import com.example.entity.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MyBatisTest {
    /**
     * 1，根据主配置文件（全局配置文件），创建一个 SqlSessionFactory 对象
     * 2，
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
        // 第一个参数为：当前要执行sql的唯一标识= namespace + . + sql的Id
        Employee employee = sqlSession.selectOne("com.example.mybatis.EmployeeMapper.getEmpById", 1);
        System.out.println(employee);
        sqlSession.close();
    }
}
