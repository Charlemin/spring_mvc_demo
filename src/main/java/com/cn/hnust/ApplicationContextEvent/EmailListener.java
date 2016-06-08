package com.cn.hnust.ApplicationContextEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2016/5/30.
 */
public class EmailListener implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        if(applicationEvent instanceof EmailEvent){

            EmailEvent emailEvent=(EmailEvent) applicationEvent;
            System.out.println("需要发送邮件的接收地址：" + emailEvent.getAddress());
            System.out.println("需要发送邮件的正文：" + emailEvent.getText());
        }
        else System.out.println("其他事件：" + applicationEvent);
    }
}
