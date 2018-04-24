package com.ifox.service.impl;

import com.ifox.dao.DepartmentMapper;
import com.ifox.entity.Department;
import com.ifox.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in20:57 2018/4/23
 * @Modified By:
 */
@Service("iDepartmentService")
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 所有部门信息
     * @return
     */
    public List<Department> getDepts(){
        List<Department>  list = departmentMapper.selectByExample(null);
        return list;
    }
}
