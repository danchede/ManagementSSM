package com.ifox.service;

import com.ifox.entity.Employee;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in20:54 2018/4/23
 * @Modified By:
 */
public interface IEmployeeService {

    List<Employee> getAll();

    int addEmp(Employee employee);

    boolean checkUser(String empName);

    Employee getEmp(Integer id);

    void updateEmp(Employee employee);

    void deleteEmp(Integer id);

    void deleteBatch(List<Integer> ids);
}
