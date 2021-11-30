package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student gemma = new Student("Gemma",
                    LocalDate.of(1980,9,24), "gemma@gmail.com");
            Student anna = new Student("Anna",
                    LocalDate.of(1990,2,18), "anna@gmail.com");
            repository.saveAll(
                    List.of(gemma,anna)
            );
        };
    }
}
