//IntelliJ IDEA
//Sprin01
//JdbcTemplateManager
//2020/1/17
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode.manager;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateManager {
    public static void main(String[] args) {
        JdbcTemplate jtl = null;
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        jtl = (JdbcTemplate)factory.getBean("jdbcTemplate");
        String sql="insert into user(name,age,sex) values('御风',100,'男')";
        try{
            jtl.update(sql);
            System.out.println("执行插入成功");
        }catch (Exception e){
            System.out.println("执行失败，原因："+e.getMessage());
        }
    }
}
