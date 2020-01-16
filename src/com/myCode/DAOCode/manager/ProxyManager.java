//IntelliJ IDEA
//Sprin01
//ProxyManager
//2020/1/16
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode.manager;

import com.myCode.DAOCode.DAO.AddDAO;
import com.myCode.DAOCode.bean.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyManager {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        AddDAO addDAO = (AddDAO)factory.getBean("transactionProxy");
        User user = new User();
        user.setName("秋月白");
        user.setAge(27);
        user.setSex("未知");
        addDAO.addUser(user);
    }
}
