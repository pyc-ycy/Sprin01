//IntelliJ IDEA
//Sprin01
//Manager
//2019/12/21
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.main;


import com.myCode.beanSet.Student;
import com.myCode.beanSet.Agent;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Manager {
    public static void main(String[] args){
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Student student = (Student) factory.getBean("student");
        System.out.println("===========================");
        System.out.println("学生姓名："+student.getName());
        System.out.println("学生年龄："+student.getAge());
        System.out.println("学生性别："+student.getSex());
        System.out.println("==========================");
        Agent agent = (Agent)factory.getBean("agent");
        agent.printInfo();
    }
}
