package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student Gabriel =  new Student(
                    "Gabriel Okhai",
                    "Ogabrielokhai@yahoo.com",
                    LocalDate.of(2000, Month.SEPTEMBER,24)
            );

            Student Alex =  new Student(
                    "Gabriel Okhai",
                    "Alex@yahoo.com",
                    LocalDate.of(2002, Month.JANUARY,24)
                    );

            repository.saveAll(List.of(Gabriel, Alex));
        };
    }
}
