//package org.aboylan.test.springboot.app;
//
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.context.annotation.Bean;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@SpringBootConfiguration
//public class SpringFoxConfig {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("org.aboylan.test.springboot.app.controllers"))
//                .paths(PathSelectors.ant("/api/cuentas/*"))
//                .build();
//    }
//}
