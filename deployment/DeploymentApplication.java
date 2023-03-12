package com.aws.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class DeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymentApplication.class, args);
	}

}
