package com.onlinetechvision.test;

import com.onlinetechvision.model.CityDo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by online09 on 7/6/2017.
 */

@Component
public class TestBean {


    @Autowired
    private LocalSessionFactoryBean sessionFactory;





    /*@Autowired
    @Qualifier("personBean2")*/
    private PersonBean personBean;

    private int id;

    private  String name;

    public PersonBean getPersonBean() {
        return personBean;
    }

    public void setPersonBean(PersonBean personBean) {
        this.personBean = personBean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Transactional
    public void getCityUpdated(){


        Session session = sessionFactory.getObject().getCurrentSession();
        /*session.beginTransaction();
        session.getTransaction().begin();*/

        CityDo cityDo =(CityDo) session.get(CityDo.class,new Integer(15));
        /*session.getTransaction().commit();*/


/*
        Criteria cr = session.createCriteria(CityDo.class);
        cr.add(Restrictions.eq("id", 12));
        cityDo = (CityDo) cr.uniqueResult();*/

        System.out.println(cityDo.getName());


    }

    @Transactional
    public void InsertCity(CityDo cityDo){
        Session session = sessionFactory.getObject().getCurrentSession();


         session.saveOrUpdate(cityDo);
        System.out.println(cityDo.getId());


    }

}
