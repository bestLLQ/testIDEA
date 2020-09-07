package com.llq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("KUNKUN")
                .apiInfo(llqApiInfo());
    }

    public ApiInfo llqApiInfo(){
        return new ApiInfoBuilder()
                .description("jintian写的接口")
                .version("1.0")
                .title("调试接口1")
                .license("aaa")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact("1072546406@qq.com")
                .build();
    }

}
