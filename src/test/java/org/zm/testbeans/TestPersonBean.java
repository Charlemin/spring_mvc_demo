package org.zm.testbeans;

import com.cn.hnust.BeanFactory.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by Administrator on 2016/5/30.
 */
public class TestPersonBean {

    private Person person;
    private ApplicationContext ac=null;
    @Test
    public void test(){

        ac=new ClassPathXmlApplicationContext("beans.xml");

    }
}
