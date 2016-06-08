package org.zm.testbeans;

import com.cn.hnust.ApplicationContextEvent.EmailEvent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by Administrator on 2016/5/30.
 */
public class TestApplicationListener {

    @Test
    public void test(){

        ApplicationContext appletContext=new ClassPathXmlApplicationContext("beans.xml");
        EmailEvent emailEvent=new EmailEvent("test","minizha@163.com","this is applicationContext event");
        appletContext.publishEvent(emailEvent);
    }

}
