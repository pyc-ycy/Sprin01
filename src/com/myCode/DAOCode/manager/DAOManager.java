//IntelliJ IDEA
//Sprin01
//DAOManager
//2020/1/15
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode.manager;

import com.myCode.DAOCode.bean.User;
import com.myCode.DAOCode.DAO.UserDAO;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DAOManager {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = new User();
        user.setName("朱雀");
        user.setAge(20);
        user.setSex("女");
        UserDAO userDAO = (UserDAO)factory.getBean("userDAO");
        userDAO.insertUser(user);
        System.out.println("添加数据成功！！！");
    }
}
