//IntelliJ IDEA
//Sprin01
//DAOManager
//2020/1/15
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DAOManager {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setSex("男");
        UserDAO userDAO = (UserDAO)factory.getBean("userDAO");
        userDAO.insertUser(user);
        System.out.println("添加数据成功！！！");
    }
}
