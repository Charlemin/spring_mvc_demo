package org.zm.testmybatis;

/**
 * Created by Eric on 2016/4/7.
 */

import com.cn.hnust.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cn.hnust.pojo.Gdline;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
     private static Logger logger = Logger.getLogger(TestMyBatis.class);
     private ApplicationContext ac = null;
     private Gdline gdline;
     private UserServiceImpl userService;

    @Before
   //使用junit测试，初始化方法使用@before来标识。
   public void before() {
   ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
   userService = (UserServiceImpl)ac.getBean("UserServiceImpl");
}

    @Autowired
    //UserServiceImpl userService;

    @Test
    //使用junit测试，测试方法使用@test标识。
    public  void test() {
        gdline = userService.getLineinfoById("17");
        System.out.println(gdline.toString());
    }

    public static void main(String []args){
        TestMyBatis testMyBatis=new TestMyBatis();
        testMyBatis.before();
        testMyBatis.test();
    }
}
