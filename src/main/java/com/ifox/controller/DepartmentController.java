package com.ifox.controller;

import com.ifox.common.Msg;
import com.ifox.entity.Department;
import com.ifox.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in21:01 2018/4/23
 * @Modified By:
 */
@Controller
public class DepartmentController {
    @Autowired
    private IDepartmentService iDepartmentService;

    /**
     * 返回部门信息
     * @return
     */
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        List<Department> list = iDepartmentService.getDepts();
        return Msg.success().add("depts",list);
    }
}
