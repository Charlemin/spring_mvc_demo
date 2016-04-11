package com.cn.hnust.dao;

import com.cn.hnust.pojo.Gdline;

/**
 * Created by Eric on 2016/4/7.
 */
//对应mapper的每个namespace
public interface IUserDao {

    Gdline selectByPrimaryKey(String str);

}
