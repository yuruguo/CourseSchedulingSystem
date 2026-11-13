package com.roy.coursescheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CourseSchedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseSchedulingApplication.class, args);
    }

}
