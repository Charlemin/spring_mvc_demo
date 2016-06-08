package com.cn.hnust.BeanFactory;

/**
 * Created by Administrator on 2016/5/30.
 */
public class Person {


    public Person(){

        System.out.println("==正在执行Person无参数的构造器");
    }

    public void setTest(String name){

        System.out.println("正在执行setTest方法，传入参数为："+name);
    }
}
