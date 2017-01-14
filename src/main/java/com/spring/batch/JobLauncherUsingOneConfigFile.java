package com.spring.batch;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author fahim Fahad
 */
public class JobLauncherUsingOneConfigFile {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws JobExecutionAlreadyRunningException {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("context.config.user.xml");

        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("batchJob");

        JobExecution execution;
        try {
            execution = jobLauncher.run(job, new JobParameters());
        } catch (JobRestartException ex) {
            Logger.getLogger(JobLauncher2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JobInstanceAlreadyCompleteException ex) {
            Logger.getLogger(JobLauncher2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JobParametersInvalidException ex) {
            Logger.getLogger(JobLauncher2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Done");
    }

}
