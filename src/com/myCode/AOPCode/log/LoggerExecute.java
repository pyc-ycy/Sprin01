//IntelliJ IDEA
//Sprin01
//LoggerExecute
//2020/1/14
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.AOPCode.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggerExecute implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        methodInvocation.proceed();
        return null;
    }
    private void before(){
        System.out.println("程序开始执行！");
    }
}
