package com.ifox.test;

import com.ifox.dao.DepartmentMapper;
import com.ifox.dao.EmployeeMapper;
import com.ifox.entity.Employee;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in21:05 2018/4/23
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private SqlSession sqlSession;

    /**
     * 测试DepartmentMapper
     */
    @Test
    public void testCURD(){
        /*  不是自动注入的
        1. 创建SringpIOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        2. 获取mapper
        DepartmentMapper bean = ioc.getBean(DepartmentMapper.class); */

        //1. 插入部门
        //departmentMapper.insertSelective(new Department(null,"开发部"));
        //departmentMapper.insertSelective(new Department(null,"测试部"));

        //2. 插入员工
        //employeeMapper.insertSelective(new Employee(1,"151565@qq.com",null,"王乾","M"));

        //3. 批量插入员工 使用sqlSession 批量操作
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0;i<1000;i++){
            String uid = UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Employee(1,uid+"@qq.com",null,uid,"M"));
        }
        System.out.print("完成！");
    }

}
