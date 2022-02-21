package com.rharo.scheduler;

import javax.annotation.PostConstruct;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * The Class Scheduler, contains the schedule.
 */
@Component
public class Scheduler extends AbstractScheduler {

	/**
	 * Schedule with cron.
	 * cron - expression cron for execute the method
	 */
	@Scheduled(cron = "${scheduler.cron}")
	public void scheduleWithCron() {

		callRandomJoke();
	}

	/**
	 * Schedule without cron.
	 * 
	 * initialDelayString - initial delay to execute the first time
	 * fixedDelayString - wait between each execution
	 */
	@Scheduled(initialDelayString = "${scheduler.fixed-delay}", fixedDelayString = "${scheduler.fixed-delay}")
	public void scheduleWithoutCron() {

		callRandomJokeByCategory();
	}

	/**
	 * Init scheduler.
	 */
	@PostConstruct
	public void init() {

		fillCategoriesList();
	}
}