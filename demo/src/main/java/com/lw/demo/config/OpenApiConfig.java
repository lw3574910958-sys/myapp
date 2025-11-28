package com.lw.demo.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * swagger config for open api
 *
 * @author lw
 */
@Configuration
@EnableKnife4j
public class OpenApiConfig {

    /**
     * @return swagger config
     */
    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("My API")
                        .description("test api")
                        .version("1.0")
                        .contact(new Contact()
                                .name("lw")
                                .url("http://lw")
                                .email("suzhou.daipeng@gmail.com")));
    }
}
