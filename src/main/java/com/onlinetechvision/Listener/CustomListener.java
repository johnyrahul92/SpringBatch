package com.onlinetechvision.Listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by online09 on 6/19/2017.
 */

@Component("jobListener")
public class CustomListener implements JobExecutionListener {

    public void afterJob(JobExecution jobExecution) {

        System.out.println("After Job");
        System.out.println( new Date());

        System.out.println(jobExecution.getStatus());
        // TODO Auto-generated method stub

    }

    public void beforeJob(JobExecution jobExecution) {
        // TODO Auto-generated method stub
        System.out.println("Before Job");


    }

}
