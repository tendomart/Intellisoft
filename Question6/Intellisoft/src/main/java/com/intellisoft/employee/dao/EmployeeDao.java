package com.intellisoft.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.intellisoft.employee.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long> {

}
