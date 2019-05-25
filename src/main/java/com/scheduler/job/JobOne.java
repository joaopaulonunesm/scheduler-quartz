package com.scheduler.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scheduler.service.JobService;

@Component
public class JobOne implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(JobOne.class);

	@Autowired
	private JobService jobService;

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		LOG.info("Chamando execução do JOB");
		jobService.executar(1);

	}

}
