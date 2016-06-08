package com.cn.hnust.BeanFactory;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Administrator on 2016/5/30.
 */
public class IOC_Collecton {

    private List<String> schools;
    private Map<String,String> scores;
    private Properties health;
    private String[] books;

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public Map<String, String> getScores() {
        return scores;
    }

    public void setScores(Map<String, String> scores) {
        this.scores = scores;
    }

    public Properties getHealth() {
        return health;
    }

    public void setHealth(Properties health) {
        this.health = health;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }
}
