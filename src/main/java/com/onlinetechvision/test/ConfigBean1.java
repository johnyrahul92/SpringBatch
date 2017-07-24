package com.onlinetechvision.test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by online09 on 7/6/2017.
 */
public class ConfigBean1 {
    @Autowired
    private  ConfigBean2 configBean2;

    private  String id;

   /* public ConfigBean2 getConfigBean2() {
        return configBean2;
    }

    public void setConfigBean2(ConfigBean2 configBean2) {
        this.configBean2 = configBean2;
    }*/

    public String getId() {
        return "Config 1 : "+id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void printMsg(){

        configBean2.printMsg();
    }

    public  void init(){

        System.out.println("Inside init method configBean1");
    }
}
