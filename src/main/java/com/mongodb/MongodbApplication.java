package com.mongodb;

import com.google.common.base.Predicate;
import com.mongodb.controller.UserMsgController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by kerns on 2017/4/11.
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {
        "com.mongodb"
})
public class MongodbApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MongodbApplication.class, args);
    }

    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("user-msg-api")//组api
                .apiInfo(apiInfo())
                .select()
                .paths(testPaths())
                .build();
    }

    /**
     * api信息
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("spring boots 测试")
                .description("spring boots 测试类")
                .build();
    }

    private Predicate<String> testPaths() {
        return or(regex("/userMsg.*"));
    }
}
