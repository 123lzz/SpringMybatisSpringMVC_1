package com.hand.ssm.dao;

import java.util.HashMap;
import java.util.List;

import com.hand.ssm.dto.Employee;

public interface EmployeeDao {

	Employee selectEmployeeById(String emp_no);

	// 使用 if，单个条件
	List<Employee> selectEmployeeByDeptId(HashMap<String, Object> params);

	// 使用 if，多个条件
	List<Employee> selectEmployeeByMultiple(HashMap<String, Object> params);

	// 使用 choose（when、otherwise）
	List<Employee> findEmployee_1(HashMap<String, Object> params);

	// 使用 where
	List<Employee> findEmployee_2(HashMap<String, Object> params);

	// 动态更新语句中使用 set
	void updateEmployee(Employee employee);

	// 使用 foreach
	List<Employee> findEmployee_3(List<String> emp_nos);

	// 使用 bind
	List<Employee> findEmployee_4(Employee employee);

	// 使用 trim
	List<Employee> findEmployee_5(HashMap<String, Object> params);

}
