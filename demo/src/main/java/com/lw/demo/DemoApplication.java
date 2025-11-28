package com.lw.demo;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lw
 */
@SpringBootApplication
@RestController
public class DemoApplication {

    /**
     * 启动入口
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * hello world
     *
     * @return hello world
     */
    @GetMapping("/hello")
     public ResponseEntity<String> hello(){
         return ResponseEntity.ok("hello world");
     }

}
