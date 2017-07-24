package com.onlinetechvision.test;

import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;

/**
 * Created by online09 on 7/12/2017.
 */
public class MyInterceptor extends EmptyInterceptor {

    @Override
    public void afterTransactionBegin(Transaction tx) {

        System.out.print("Brfore Transcation");
        super.afterTransactionBegin(tx);
    }
}
