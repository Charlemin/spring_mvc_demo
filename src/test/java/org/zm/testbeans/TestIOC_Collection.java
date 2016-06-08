package org.zm.testbeans;

import com.cn.hnust.BeanFactory.IOC_Collecton;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/5/30.
 */
public class TestIOC_Collection {

    @Test
    public void test(){

        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        IOC_Collecton ioc_collecton=(IOC_Collecton)ac.getBean("ioc_collection");
        System.out.println(ioc_collecton.getSchools());
        System.out.println(ioc_collecton.getHealth());
        String[] books=ioc_collecton.getBooks();
        for(String book:books)
            System.out.println(book);
        System.out.println(ioc_collecton.getScores());

    }
}
