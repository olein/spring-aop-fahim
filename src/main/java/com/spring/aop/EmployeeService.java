package com.spring.aop;
import com.spring.aop.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
/**
 *
 * @author Fahim Fahad
 */
@Service
public class EmployeeService {

	private Employee employee;
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
}