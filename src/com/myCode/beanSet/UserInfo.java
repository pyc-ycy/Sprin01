//IntelliJ IDEA
//Sprin01
//UserInfo
//2020/1/13
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.beanSet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInfo {
    private String name;
    private char sex;
    private int age;
    private Date date;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
    public void printInfo(){
        System.out.println("姓名："+name+"\n性别："+sex+"\n年龄："+age+"\n出生日期："
                +new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
    }
}
