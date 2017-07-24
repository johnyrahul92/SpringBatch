package com.onlinetechvision.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by online09 on 7/6/2017.
 */
@Configuration
public class AppConfig {

    @Bean(initMethod = "init")
    public ConfigBean1 configBean1(){
        return new ConfigBean1();
    }

    @Bean
    public ConfigBean2 configBean2(){
        return new ConfigBean2();
    }

}
