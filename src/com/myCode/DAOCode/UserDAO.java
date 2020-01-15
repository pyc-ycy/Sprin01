//IntelliJ IDEA
//Sprin01
//UserDAO
//2020/1/15
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO implements UserDAOImpl {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insertUser(User user) {
        String name = user.getName();
        Integer age = user.getAge();
        String sex = user.getSex();
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            stmt.execute(String.format("INSERT INTO user(name,age,sex)VALUES( '%s',%d,'%s')", name, age, sex));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                try{
                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
