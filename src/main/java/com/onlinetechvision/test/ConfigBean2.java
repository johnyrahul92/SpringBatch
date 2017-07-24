package com.onlinetechvision.test;

/**
 * Created by online09 on 7/6/2017.
 */
public class ConfigBean2 {

    public ConfigBean2() {
        System.out.println("Inside ConfigBean2");
    }

    private  String id;

    public String getId() {
        return "Config 2 : "+id;
    }

    public void printMsg(){

        System.out.println("Message ConfigBean2");

    }

    public void setId(String id) {
        this.id = id;
    }
}
