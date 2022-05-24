package com.maple.code;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class CodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(CodeApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String,String>kafkaTemplate){
		return args -> {
			//input resource/data here
//			<--------------------------->
			for (int i = 0 ;i<100;i++){

				kafkaTemplate.send("code","Hello Rudy :)"+i);
			}
			
//			<--------------------------->

		};
	}

}
