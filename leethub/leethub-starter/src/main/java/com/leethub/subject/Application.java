package com.leethub.subject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.leethub",}) // 包含starter和infra模块
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
