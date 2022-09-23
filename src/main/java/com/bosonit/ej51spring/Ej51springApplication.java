package com.bosonit.ej51spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ej51springApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(Ej51springApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Ej51springApplication.class, args);
	}

	@Autowired
	@Qualifier("bean1")
	String var1;
	@Autowired
	@Qualifier("bean2")
	String var2;

	@Override
	public void run(String... args) throws Exception {
		log.info(var1);
		log.info(var2);
	}
}