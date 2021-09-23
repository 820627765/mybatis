package com.example;

import com.example.dao.EmployeeMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(Application.class, args);
        EmployeeMapper employeeMapper = ac.getBean(EmployeeMapper.class);
        System.out.println(employeeMapper.getEmployeeById(1));
    }
}
