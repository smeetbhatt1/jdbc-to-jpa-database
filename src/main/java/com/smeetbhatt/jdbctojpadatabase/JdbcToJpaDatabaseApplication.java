package com.smeetbhatt.jdbctojpadatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smeetbhatt.jdbctojpadatabase.jdbc.PersonJdbcDAO;
import com.smeetbhatt.jdbctojpadatabase.jdbc.entity.Person;
import com.smeetbhatt.jdbctojpadatabase.repositories.PersonJpaRepository;

@SpringBootApplication
public class JdbcToJpaDatabaseApplication implements CommandLineRunner {
	
	//jdbc
	/*@Autowired
	PersonJdbcDAO personDao;*/
	
	//jpa
	@Autowired
	PersonJpaRepository repository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JdbcToJpaDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//jdbc
		/*logger.info("Single users 10001 -> {}", personDao.findById(10001));
		logger.info("Delete User 10002 -> {}", personDao.deleteById(10002));
		logger.info("Insert User 10010 -> {}", personDao.insert(new Person(10010, "Jordan", "USA", new Date())));
		logger.info("Update User 10002 -> {}", personDao.update(new Person(10010, "Jordan", "Delhi", new Date())));
		logger.info("All users -> {}", personDao.findAll());*/
		
		//jpa
		logger.info("Single users 10001 -> {}", repository.findById(10001));
		logger.info("Insert User 10010 -> {}", repository.insert(new Person("Jordan", "USA", new Date())));
		logger.info("Update User 10002 -> {}", repository.update(new Person(10003, "Jordan", "Delhi", new Date())));

		logger.info("Delete User 10002 -> {}", repository.deleteById(10002));
		
		logger.info("Single users 10001 -> {}", repository.findAll());
		
	}

}
