package cn.miaogu.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 一直都是大番茄
 * @Time 2020-10-13 0:39
 * @Email 41481601@qq.com
 */
public class MyTime {
    public static String get24Time(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }
}
