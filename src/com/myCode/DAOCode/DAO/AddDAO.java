//IntelliJ IDEA
//Sprin01
//AddDAO
//2020/1/16
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode.DAO;
import com.myCode.DAOCode.bean.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AddDAO extends JdbcDaoSupport{
    public void addUser(User user){
        String sql = String.format("insert into user(name,age,sex) values('%s',%d,'%s')",user.getName(),user.getAge(),user.getSex());
        try{
            assert getJdbcTemplate() != null;
            getJdbcTemplate().execute(sql);
        }catch (Exception e){
            System.out.println("执行失败,原因:"+e.getMessage());
        }
    }
}
