//IntelliJ IDEA
//Sprin01
//Manager
//2020/1/14
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.AOPCode.manager;

import com.myCode.AOPCode.log.LoggerExecute;
import com.myCode.AOPCode.target.Target;
import org.springframework.aop.framework.ProxyFactory;

public class Manager {
    public static void main(String[] args) {
        Target target = new Target();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new LoggerExecute());
        proxyFactory.setTarget(target);
        Target proxy = (Target)proxyFactory.getProxy();
        proxy.execute("AOP 的简单实现！");
    }
}
