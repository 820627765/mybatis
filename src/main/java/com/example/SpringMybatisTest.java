package com.example;

import com.example.config.MyConfig;
import com.example.dao.EmployeeMapper;
import com.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMybatisTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        EmployeeMapper employeeMapper = ac.getBean(EmployeeMapper.class);
        Employee employee = employeeMapper.getEmployeeById(1);
        System.out.println(employee);
    }
}
