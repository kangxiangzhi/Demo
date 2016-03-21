package com.Shop.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
public class BaseDao {
    private SessionFactory sessionFactory ;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }

    protected Session getSession() {
        return getSessionFactory().getCurrentSession();
    }
}
