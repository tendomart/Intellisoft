package com.intellisoft.employee.service.impl;

import java.util.Date;

import com.intellisoft.employee.model.ContractInformation;
import com.intellisoft.employee.model.Employee;

//@SpringBootTest
public class EmployeeServiceImplTest {
    Employee emp = new Employee();
    ContractInformation ct = new ContractInformation(1L, true, new Date(), "short")	;
	EmployeeServiceImpl emps = new  EmployeeServiceImpl();
	
//	@Test
//	public void testGetAllItems() {
//		emp.setId(1);
//		emp.setAddress("Kampala");
//		emp.setDate_of_birth(new Date());
//		emp.setName("Kakoma James");
//		emp.setContract_info(ct);
//		
//		emps.addItem(emp);
//		assertEquals(emp, emps.getAllItems());
//		
//	}
//	
//	@Test
//	public void testAddItem() {
//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setAddress("Kampala");
//		emp.setDate_of_birth(new Date());
//		emp.setName("Kakoma James");
//		emp.setContract_info(ct);
//		
//		Employee obj = new Employee(1, "Kakoma James", new Date(), "Kampala", ct);
//		assertEquals("Checkin Equality", obj.getId(), emp.getId());
//	}
}
