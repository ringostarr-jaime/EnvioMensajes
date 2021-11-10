/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.twilio.whatsapp.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author Jymmy
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
     //http://localhost:8880/swagger-ui.html
	@Bean
	public Docket apiDocket() {
	    return new Docket(DocumentationType.SWAGGER_2)
	            .select()
	            .apis(RequestHandlerSelectors.any())
	            .paths(PathSelectors.any())
	            .build()
	            .apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
	    return new ApiInfo(
	            "SWAGGER PROBADOR DE SERVICIOS", //NAME
	            "", //DESCRIPTION
	            "VERSION 1.0", //VERSION
	            "TERMS OF SERVICE URL", //TERMS OF SERVICE URL
	            new Contact("JAIME RODAS","","jaimerodas10@gmail.com"),
	            "LICENSE", //LICENSE
	            "IS FINE, todo uva" //TERMS OF LICENSE URL
	    );
	}
}
