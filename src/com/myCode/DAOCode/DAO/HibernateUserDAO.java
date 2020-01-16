//IntelliJ IDEA
//Sprin01
//HibernateUserDAO
//2020/1/16
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.DAOCode.DAO;

import javax.annotation.Resource;

import com.myCode.DAOCode.bean.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

@Resource
@Transactional(readOnly=false)
public class HibernateUserDAO extends HibernateDaoSupport{
    public void insert(final User user){
        try{
            assert getHibernateTemplate() != null;
            getHibernateTemplate().execute(new HibernateCallback<User>() {
                @Override
                public User doInHibernate(Session session) throws HibernateException {
                    session.save(user);
                    return null;
                }
            });
        }catch (Exception e){
            System.out.println("执行失败,原因:"+e.getMessage());
        }
    }
}
