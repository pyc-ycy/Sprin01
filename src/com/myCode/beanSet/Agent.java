//IntelliJ IDEA
//Sprin01
//Agent
//2020/1/11
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.beanSet;

public class Agent {
    private String name;
    private Integer age;
    private String sex;
    private String addr;
    public Agent(String name,Integer age, String sex, String addr){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.addr=addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }

    public void printInfo(){
        System.out.println("客户姓名："+name);
        System.out.println("客户年龄："+age);
        System.out.println("客户性别："+sex);
        System.out.println("客户地址："+addr);
    }
}
