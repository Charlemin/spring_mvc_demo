package org.zm.testbeans;

import com.cn.hnust.service.PersonBean;
import com.cn.hnust.service.impl.UserBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Eric on 2016/4/11.
 */
public class TestBean {

    private PersonBean bean;
    @Test
    public void testMethod() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        //Bean交给sping容器管理之后，Bean默认情况下是单实例的。
        bean =(UserBean)ac.getBean("userbean");
        bean.show();
    }
}
