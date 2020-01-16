//IntelliJ IDEA
//Sprin01
//TransactionManage
//2020/1/16
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode.manager;

import com.myCode.DAOCode.transaction.TransactionExample;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionManage {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        TransactionExample example = (TransactionExample)factory.getBean("transactionExample");
        example.transactionOperation();
    }
}
