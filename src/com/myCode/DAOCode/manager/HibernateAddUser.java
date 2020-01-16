//IntelliJ IDEA
//Sprin01
//HibernateAddUser
//2020/1/16
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode.manager;

import com.myCode.DAOCode.DAO.HibernateUserDAO;
import com.myCode.DAOCode.bean.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateAddUser {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        HibernateUserDAO userDAO = (HibernateUserDAO)factory.getBean("hibernateUserDAO");
        User user = new User();
        user.setName("SpringHibernate");
        user.setAge(20);
        user.setSex("男");
       try{
           userDAO.insert(user);
           System.out.println("添加成功");
       }catch (Exception e){
           System.out.println("添加失败,原因:"+e.getMessage());
       }
    }
}
