package main.java.com.onlinetechvision.spring.batch;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * BatchProcessStarter Class launches the jobs and logs their execution results.
 * 
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */

@Component("batchProcessStarter")
public class BatchProcessStarter {

	private static final Logger logger = Logger.getLogger(BatchProcessStarter.class);
	
	@Autowired
	private Job firstJob;
	@Autowired
	private Job secondJob;
	/*@Autowired
	private Job thirdJob;*/
	@Autowired
	private JobLauncher jobLauncher;
	@Autowired
	private JobRepository jobRepository;

	/**
     * Starts the jobs and logs their execution results.
     *
     */
	public void start() {
		JobExecution jobExecution = null;
		JobParametersBuilder builder = new JobParametersBuilder();
		
		try {
			jobLauncher.run(firstJob, builder.toJobParameters());
			jobExecution = jobRepository.getLastJobExecution(firstJob.getName(), builder.toJobParameters());
			logger.debug(jobExecution.toString());
	
			jobLauncher.run(secondJob, builder.toJobParameters());
			jobExecution = jobRepository.getLastJobExecution(secondJob.getName(), builder.toJobParameters());
			logger.debug(jobExecution.toString());
			
			/*getJobLauncher().run(getThirdJob(), builder.toJobParameters());
			jobExecution = getJobRepository().getLastJobExecution(getThirdJob().getName(), builder.toJobParameters());
			logger.debug(jobExecution.toString());*/
		
		} catch (JobExecutionAlreadyRunningException 
					| JobRestartException
					| JobInstanceAlreadyCompleteException
					| JobParametersInvalidException e) {
			logger.error(e);
		}
			
	}	


	
}