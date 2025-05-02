package com.javarush.jira;

import com.javarush.jira.common.internal.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

import java.util.HashMap;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
@EnableCaching
public class JiraRushApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiraRushApplication.class, args);
        //branch task-2
        //commit test 2 with a comment
        //commit test 3 with a comment
    }
}
