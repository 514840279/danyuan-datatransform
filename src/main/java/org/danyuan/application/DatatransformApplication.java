package org.danyuan.application;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class DatatransformApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DatatransformApplication.class, args);
	}
	
}
