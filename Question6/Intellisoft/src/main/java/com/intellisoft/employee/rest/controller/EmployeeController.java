package com.intellisoft.employee.rest.controller;

import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellisoft.employee.model.Employee;
import com.intellisoft.employee.service.impl.EmployeeServiceImpl;

//Rest controller to carry out crud operations
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	//Inject Service
	 @Autowired
	    private EmployeeServiceImpl serv;
	 
	 //Get all Employee
	 @GetMapping("/employees")
	    public ResponseEntity<Iterable<Employee>> getAllEmployees() {
//	        return serv.getAllItems();
	        return ResponseEntity.ok().body(serv.getAllItems());
	    }
	 
	 //Add an employee
	 @PostMapping("/employee")
	    public ResponseEntity<Optional<Employee>> createEmployee(@Valid @RequestBody Employee emp) {  
		 serv.addItem(emp);
	        return ResponseEntity.ok(null);
	    }
	 
	 //Get Employee by Id
	 @GetMapping("/employee/{id}")
	    public ResponseEntity<Optional<Employee>> getEmployeeById(
	        @PathVariable(value = "id") long id) {
		 Optional<Employee> emp = serv.getItemById(id);
	      return ResponseEntity.ok().body(emp);
	    }

	// ------------------- Update a User ------------------------------------------------
	 
	    
	  
	 // --- Delete Employee
	 @DeleteMapping(value = "/user/{id}")
	    public ResponseEntity<?> deleteEmployee(@PathVariable("id") long id) {
	      
	        Optional<Employee> emp = serv.getItemById(id);
	        if (emp == null) {
	            return new ResponseEntity(HttpStatus.NOT_FOUND);
	        }
	        serv.removeItem(id);
	        return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
	    }
}
