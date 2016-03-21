package com.Shop.Dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
public interface IGeneralDao {
    public <T> T findById(Class<T> type, Serializable id);

    public <T> List<T> findAll(Class<T> type);

    public void save(Object... entities);

    public void update(Object... entities);

    public void saveOrUpdate(Object entity);

    public void delete(Object... entities);

    public void deleteById(Class<?> type, Serializable id);

    public void refresh(Object... entities);

    public void flush();
}
