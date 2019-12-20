package com.intellisoft.employee.service;

import java.util.Optional;
//Service Interface
public interface EmployeeService<Entity> {
	Iterable<Entity> getAllItems();
	
	 void addItem(Entity fm);
	
	 void updateItem(Entity fm);
	
	 Optional<Entity> getItemById(long id);
	
	 void removeItem(long id);
	
	 void removeItemByName(Entity bio);
	
	 void removeAllItems();
}
