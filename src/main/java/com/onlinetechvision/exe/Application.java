package main.java.com.onlinetechvision.exe;

import main.java.com.onlinetechvision.spring.batch.BatchProcessStarter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Application Class starts the application.
 * 
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */
public class Application {

	/**
     * Starts the application
     *
     * @param  String[] args
     *
     */
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BatchProcessStarter batchProcessStarter = (BatchProcessStarter)appContext.getBean("batchProcessStarter");
		batchProcessStarter.start();
	}

}
