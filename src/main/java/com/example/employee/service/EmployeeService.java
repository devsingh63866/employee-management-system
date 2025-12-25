package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dto.EmployeeDetails;
import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
@Service

public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository ;
	
	// save employee 
	 public Employee saveEmployee(Employee employee) {
		 return employeeRepository.save(employee);
		 
	 }
	 
	// Get all employees
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    // Get employee by ID
	    public Employee getEmployeeById(Long id) {
	        return employeeRepository.findById(id).orElse(null);
	    }

	    // Delete employee by ID
	    public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	    }
	
	    
	    // update employee
	    
	    public Employee updateEmployee(Long id ,EmployeeDetails employeeDetails) {
	    		
	    		Employee employee = employeeRepository.findById(id).orElse(null);
	    		
	    		if(employee!=null) {
	    			employee.setName(employeeDetails.getName());;
	    			employee.setDepartment(employeeDetails.getDepartment());
	    			employee.setSalary(employeeDetails.getSalary());
	    			return employeeRepository.save(employee);
	    			
	    		}
	    		return null;
	    }
	

}
