package com.cn.hnust.pojo;

/**
 * Created by Eric on 2016/4/7.
 */
public class Gdline {

    //
    private String Line_name;
    private String Stop_cnt;
    private String Line_type;

    public String getLine_type() {
        return Line_type;
    }

    public void setLine_type(String line_type) {
        this.Line_type = line_type;
    }

    public String getStop_cnt() {
        return Stop_cnt;
    }

    public void setStop_cnt(String stop_cnt) {
        this.Stop_cnt = stop_cnt;
    }

    public String getLine_name() {
        return Line_name;
    }

    public void setLine_name(String line_name) {
        this.Line_name = line_name;
    }

    public String toString(){
            return "Gd_line[Line_name="+Line_name+" , Stop_cnt="+Stop_cnt+" , Line_Type="+Line_type+"]";
    }
}
