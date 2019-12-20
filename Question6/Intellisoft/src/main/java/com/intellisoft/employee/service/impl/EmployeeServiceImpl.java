package com.intellisoft.employee.service.impl;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.intellisoft.employee.dao.EmployeeDao;
import com.intellisoft.employee.model.Employee;
import com.intellisoft.employee.service.EmployeeService;
//Employee Service Business Object
@Service
@Qualifier("employeeServiceImpl")
public class EmployeeServiceImpl  implements EmployeeService<Employee>{
	private static final Logger log = LogManager.getLogger("com.intellisoft.employee.service.impl.EmployeeServiceImpl");

	@Autowired
	public EmployeeDao emp;
	//return all employees

	@Override
	public Iterable<Employee> getAllItems() {
		return emp.findAll();
	}

	@Override
	public void addItem(Employee fm) {
		emp.save(fm);
	}

	@Override
	public void updateItem(Employee fm) {
		emp.save(fm);
	}

	@Override
	public Optional<Employee> getItemById(long id) {
		return emp.findById(id);
	}

	@Override
	public void removeItem(long id) {
		emp.deleteById(id);
	}

	@Override
	public void removeItemByName(Employee bio) {
	emp.delete(bio);
	}

	@Override
	public void removeAllItems() {
		emp.deleteAll();
	}
	

}
