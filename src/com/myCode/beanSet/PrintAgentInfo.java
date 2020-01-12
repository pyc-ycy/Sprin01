//IntelliJ IDEA
//Sprin01
//PrintAgentInfo
//2020/1/12
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.beanSet;

public class PrintAgentInfo {
    private Agent agent;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
    public void PrintAgent(){
        System.out.println("PrintAgentInfo 打印的 Agent 属性");
        System.out.println("客户姓名："+agent.getName());
        System.out.println("客户年龄："+agent.getAge());
        System.out.println("客户性别："+agent.getSex());
        System.out.println("客户地址："+agent.getAddr());
    }
}
