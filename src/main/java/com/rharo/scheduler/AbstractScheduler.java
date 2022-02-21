package com.rharo.scheduler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rharo.client.dto.JokeDto;
import com.rharo.constants.Constants;
import com.rharo.interfaces.JokeService;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * The Class AbstractScheduler.
 */
@Getter
@Setter
@Slf4j
public abstract class AbstractScheduler {

	@Autowired
	protected JokeService jokeService;

	protected List<String> categoriesList = new ArrayList<>();

	protected void callRandomJoke() {

		log.info(Constants.LOG_CALL_SERVICE, "getRandomJoke");

		JokeDto jokeDto = jokeService.findJoke();

		log.info("Randome Joke : ".concat(jokeDto.toString()));

	}

	protected void callRandomJokeByCategory() {

		log.info(Constants.LOG_CALL_SERVICE, "getRandomJokeByCategory");

		JokeDto jokeDto = jokeService.findByCategory(categoriesList.get(0));

		log.info("Randome Joke : ".concat(jokeDto.toString()));

	}

	protected void fillCategoriesList() {

		log.info(Constants.LOG_CALL_SERVICE, "getCategoriesJoke");

		categoriesList = jokeService.findCategoriesJoke();

		log.info("Available categories : {} ", categoriesList);

	}

}