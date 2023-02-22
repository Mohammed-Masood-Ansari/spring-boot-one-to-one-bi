package com.qsp.springbootonetoonebi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SpringFoxConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.p
				
	}
	
	private ApiInfo metaData(){
		return new ApiInfoBuilder()
				.title("one-to-one-swagger-configuration")
		.description("")
		.version("")
		.license("")
		.licenseUrl("")
		.contact(new Contact("", "", ""))
		.build();
	}
}
