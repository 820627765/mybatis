package com.example.dao;

import com.example.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmployeeMapper {
    Employee getEmployeeById(Integer id);
}
