//IntelliJ IDEA
//Sprin01
//TransactionExample
//2020/1/16
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode.transaction;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Resource(name = "transactionManager")
public class TransactionExample {
    DataSource dataSource;  //注入数据源
    PlatformTransactionManager transactionManager; //注入事务管理器
    TransactionTemplate transactionTemplate; //注入TransactionTemplate 模板

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public PlatformTransactionManager getTransactionManager() {
        return transactionManager;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }
    public void transactionOperation(){
        transactionTemplate.execute(new TransactionCallback() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                Connection conn = DataSourceUtils.getConnection(dataSource);//获得数据库连接
                try{
                    Statement stmt = conn.createStatement();
                    stmt.execute("insert into user(name,age,sex) values('小强',26,'男')");
                    int a=0;    //制造异常测试事务是否配置成功
                    a=9/a;
                    stmt.execute("insert into user(name,age,sex) values('Tonny',24,'女')");
                    System.out.println("执行成功");
                }catch (Exception e){
                    transactionManager.rollback(transactionStatus);
                    System.out.println("操作执行失败,事务回滚!");
                    System.out.println("原因:"+e.getMessage());
                }
                return null;
            }
        });
    }
}
