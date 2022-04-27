package com.hand.ssm.controller;

import com.hand.ssm.dao.EmployeeDao;
import com.hand.ssm.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao EmployeeDao;


    // 使用 trim
    @RequestMapping("/testFindEmployee_5")
    public String testFindEmployee_5() {
        try {

            HashMap<String, Object> params = new HashMap<String, Object>();
            // 设置 dept_id 属性， emp_marriage 属性， emp_gender 属性
            params.put("dept_id", "101");
            params.put("emp_marriage", "未婚");
            params.put("emp_gender", "女");

            List<Employee> employees = EmployeeDao.findEmployee_5(params);
            // log.info(employees);
            for (Employee emp : employees) {
                System.out.println(emp);
                // log.info(employee);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
        return "";
    }

    // 使用 bind
    @RequestMapping("/testFindEmployee_4")
    public String testFindEmployee_4() {

        try {


            Employee employee = new Employee();
            employee.setEmp_name("李");
            List<Employee> employees = EmployeeDao.findEmployee_4(employee);
            // log.info(employees);
            for (Employee emp : employees) {
                System.out.println(emp);
                // log.info(employee);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

        }
        return "";
    }

    // 使用 foreach
    @RequestMapping("/testFindEmployee_3")
    public String testFindEmployee_3() {

        try {

            List<String> emp_nos = new ArrayList<String>();
            emp_nos.add("HW9803");
            emp_nos.add("HW9804");
            emp_nos.add("HW9808");
            List<Employee> employees = EmployeeDao.findEmployee_3(emp_nos);
            // log.info(employees);
            for (Employee employee : employees) {
                System.out.println(employee);
                // log.info(employee);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }
        return "";
    }

    // 动态更新语句中使用 set\
    @RequestMapping("/testUpdateEmployee")
    public String testUpdateEmployee(String emp_no) {

        try {

            Employee employee = EmployeeDao.selectEmployeeById(emp_no);
            System.out.println(employee);
            // 设置需要修改的属性
//			employee.setEmp_name("许天仪");
//			employee.setEmp_nation("汉");
//			employee.setEmp_blood("O型");
//			employee.setEmp_email("xu@163.com");
//			employee.setEmp_zzmm("党员");
//			employee.setEmp_state("退休");

            employee.setEmp_name("马宏魁");
            employee.setEmp_nation("回");
            employee.setEmp_blood("B型");
            employee.setEmp_email("ma@163.com");
            employee.setEmp_zzmm("群众");
            employee.setEmp_state("退休");

            EmployeeDao.updateEmployee(employee);
            System.out.println(employee);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
        return "";
    }

    // 使用where
    @RequestMapping("/testFindEmployee_2")
    public String testFindEmployee_2() {
        try {

            HashMap<String, Object> params = new HashMap<String, Object>();
            // 设置emp_health 属性， dept_id 属性，或 emp_marriage 属性和 emp_gender 属性
            params.put("emp_health", "良好");
            params.put("dept_id", "101");
            params.put("emp_marriage", "未婚");
            params.put("emp_gender", "女");

            List<Employee> employees = EmployeeDao.findEmployee_2(params);
            // log.info(employees);
            for (Employee employee : employees) {
                System.out.println(employee);
            }

        } finally {

        }
        return "";
    }

    // 使用 choose（when、otherwise）
    @RequestMapping("/testFindEmployee_1")
    public String testFindEmployee_1() {
        try {

            HashMap<String, Object> params = new HashMap<String, Object>();
            // 设置 dept_id 属性，或 emp_marriage 属性和 emp_gender 属性
            // params.put("dept_id", "101");
            params.put("emp_marriage", "未婚");
            params.put("emp_gender", "女");

            List<Employee> employees = EmployeeDao.findEmployee_1(params);
            // log.info(employees);
            for (Employee employee : employees) {
                System.out.println(employee);
                // log.info(employee);
            }

        } finally {
        }
        return "";
    }

    // 测试 if，多个条件
    @RequestMapping("/testSelectEmployeeByMultiple")
    public String testSelectEmployeeByMultiple() {
        try {

            HashMap<String, Object> params = new HashMap<String, Object>();
            // 设置 emp_nation 属性，emp_blood 属性，emp_marriage 属性
            params.put("emp_nation", "汉族");
            params.put("emp_blood", "O型");
            params.put("emp_marriage", "未婚");

            List<Employee> employees = EmployeeDao.selectEmployeeByMultiple(params);
            // log.info(employees);
            for (Employee employee : employees) {
                System.out.println(employee);
                // log.info(employee);
            }

        } finally {
        }
        return "";
    }

    // 测试 if，单个条件
    @RequestMapping("/testSelectEmployeeByDeptId")
    public String testSelectEmployeeByDeptId(String dept_id) {
        try {

            HashMap<String, Object> params = new HashMap<String, Object>();
            // 设置 dept_id 属性
            params.put("dept_id", dept_id);

            List<Employee> employees = EmployeeDao.selectEmployeeByDeptId(params);
            // log.info(employees);
            for (Employee employee : employees) {
                System.out.println(employee);
                // log.info(employee);
            }

        } finally {

        }
        return "";
    }
}
