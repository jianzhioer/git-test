package com.lxf.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze {
    public static void main(String[] args){
        String url="http://center-main.dtcaes.com/manage/view/index.html#/index/cn-beijing/regft/cloud-globaldashboard";
        Pattern pattern = Pattern.compile("(?<=//).*?(?=/)");
        Matcher matcher = pattern.matcher(url);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
