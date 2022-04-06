package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student vipin = new Student(
                    "Vipin",
                    "test@gmail.com",
                    LocalDate.of(1997, Month.JUNE, 07)

            );

            Student janu = new Student(
                    "Janu",
                    "janu@gmail.com",
                    LocalDate.of(2000, Month.MAY, 07)
            );

            Student manu = new Student(
                    "Manu",
                    "manu@gmail.com",
                    LocalDate.of(2020, Month.MAY, 02)
            );

            repository.saveAll(List.of(vipin, janu, manu));
        };
    }
}
