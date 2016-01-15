package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Application implements CommandLineRunner {

  private static Log log = LogFactory.getLog(Application.class);

  
  @Autowired
  JdbcTemplate jdbcTemplate;
  

  @Override
  public void run(String...strings) throws Exception{
	  //TODO PRE-EXECUTE
  }

  public static void main(String[] args) {
    log.info("*** Debut Application Run ***");
    SpringApplication.run(Application.class, args);
		// TODO

	}

}
