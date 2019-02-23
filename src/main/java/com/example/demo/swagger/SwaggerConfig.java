package com.example.demo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(PathSelectors.ant("/**"))
				.build()
				.apiInfo(apInfo());
	}
	
	private ApiInfo apInfo() {
		Contact contact = new Contact("NICKFURY", "https://Shield.com/", "thiagoconsultor1@gmail.com");
		return new ApiInfoBuilder()
				.title("ShieldAgents - Api de chamados de socorro")
				.description("interactive user api documentation")
				.version("BETA")
				.contact(contact)
				.build();
	}
}
