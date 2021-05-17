package itheima_02;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //创建日期对象
        Date d = new Date();
        String s1 = DateUtils.dateTOString(d,"yyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateTOString(d, "yyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateTOString(d, "HH:mm:ss");
        System.out.println(s3);
        System.out.println("--------");

        String s ="2048-08-09 12:12:12";
        Date dd = DateUtils.stringToDate(s, "yyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}
