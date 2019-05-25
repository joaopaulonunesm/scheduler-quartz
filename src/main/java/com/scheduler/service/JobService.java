package com.scheduler.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class JobService {

	private static final Logger LOG = LoggerFactory.getLogger(JobService.class);

	public void executar(Integer numeroJob) {

		String log = "Job " + numeroJob + " sendo executado!";

		LOG.info(log);
	}

}
