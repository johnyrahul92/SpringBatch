package com.onlinetechvision.test;


import com.onlinetechvision.model.CityDo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by online09 on 7/6/2017.
 */
public class TestApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("testContext.xml");

        System.out.println(appContext);




        ConfigBean1 configBean1 = appContext.getBean(ConfigBean1.class);
        configBean1.printMsg();

        TestBean testBean = (TestBean) appContext.getBean("testBean");

        System.out.println(testBean.getId()+ "  " + testBean.getName());

        System.out.println(testBean.getPersonBean().getFirstName()+" "+testBean.getPersonBean().getLastName());

        testBean.getCityUpdated();

        CityDo cityDo = new CityDo();

       cityDo.setId(14);

        cityDo.setCountryCode("INssD");
        /*cityDo.setDistrict("Thrissur");
        cityDo.setName("Arimpur");
        cityDo.setPopulation("545646456");
        cityDo.setDate(new Date());*/

//       testBean.InsertCity(cityDo);


    }
}
