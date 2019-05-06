package com.wuniu.printmanage.config;

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

/**
 * @author Yan
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    final static String API_BASE_PACKAGE = "com.wuniu.printmanage.controller";

    @Bean
    Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage(API_BASE_PACKAGE))
            .paths(PathSelectors.any())
            .build();
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("打印管理系统API")
            //        .description("")
            //        .termsOfServiceUrl("google.com")
            .contact(contact())
            .version("v1.0")
            .build();
    }

    Contact contact() {
        return new Contact("Yan_曹彦宝",
            "", "cyb19950118@163.com");
    }
}
