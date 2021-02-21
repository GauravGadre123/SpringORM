package com.techno.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techno.dao.EmployeeDao;
import com.techno.entites.Employee;


public class App 
{
    public static void main( String[] args )
    {ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");

	EmployeeDao empdao= (EmployeeDao)con.getBean("empdao");
	
	Employee employee= new Employee(102,"ramesh","pune");
	
	//int r= empdao.saveEmployee(employee);
	
	//Employee emp=empdao.getEmployee(101);
	
	List<Employee> emp=empdao.getAllEmployee();
	
	//empdao.updateEmployee(employee);
	
	//empdao.deleteEmployee(employee);

	System.out.println(emp);

    }
}
