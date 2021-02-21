package com.techno.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.techno.entites.Employee;

public class EmployeeDao {

	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional
	public int saveEmployee(Employee emp) {

		int n = (Integer) template.save(emp);

		return n;

	}

	@Transactional
	public void updateEmployee(Employee emp) {

		template.saveOrUpdate(emp);

	}

	@Transactional
	public void deleteEmployee(Employee emp) {

		template.delete(emp);

	}

	public Employee getEmployee(int id) {

		Employee emp = template.get(Employee.class, id);

		return emp;

	}

	public List<Employee> getAllEmployee() {

		List<Employee> emp = template.loadAll(Employee.class);

		return emp;

	}

}
