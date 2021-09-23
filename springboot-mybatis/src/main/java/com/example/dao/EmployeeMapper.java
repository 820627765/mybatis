package com.example.dao;

import com.example.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    Employee getEmployeeById(Integer id);
}
