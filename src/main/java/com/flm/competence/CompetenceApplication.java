package com.flm.competence;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.flm.competence.dao")
public class CompetenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompetenceApplication.class, args);
    }

}
