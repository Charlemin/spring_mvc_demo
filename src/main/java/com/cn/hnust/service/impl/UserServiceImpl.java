package com.cn.hnust.service.impl;

import com.cn.hnust.pojo.Gdline;
import com.cn.hnust.service.IUserService;
import javax.annotation.Resource;
import com.cn.hnust.dao.IUserDao;

/**
 * Created by Eric on 2016/4/7.
 */
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public Gdline getLineinfoById(String str) {
        // TODO Auto-generated method stub
        System.out.println("vfsg");
        return userDao.selectByPrimaryKey(str);
    }
}
