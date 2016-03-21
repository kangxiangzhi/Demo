package com.Shop.Service;

import com.Shop.Dao.IGeneralDao;
import com.Shop.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private IGeneralDao userDao;

    /*
     * 这里要有事务注解，默认readOnly=true,不设置的话会报错。
     * insert和update操作都要。
     */
    @Transactional(readOnly=false)
    public boolean registe(User user) {
        userDao.save(user);
        return false;
    }
}
