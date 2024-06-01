package com.v;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.v.properties.MyProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyProperties.class)
public class VBootPropertiesFromYmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(VBootPropertiesFromYmlApplication.class, args);
	}

}
