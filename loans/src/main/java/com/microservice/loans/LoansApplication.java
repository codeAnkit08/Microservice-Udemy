package com.microservice.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservices Rest API Documentation",
				description = "Loans microservices Rest API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ankit Tamrakar",
						email =  "student@microservice.com",
						url = "http://mywebsite.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "http://mywebsite.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Loans microservices Rest API Documentation",
				url = "http://localhost:8090/swagger-ui/index.html"

		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
