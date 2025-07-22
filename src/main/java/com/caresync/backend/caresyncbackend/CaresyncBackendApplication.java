package com.caresync.backend.caresyncbackend;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.annotation.Bean;
    import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

    @SpringBootApplication
    public class CaresyncBackendApplication {

        public static void main(String[] args) {
            SpringApplication.run(CaresyncBackendApplication.class, args);
        }

        @Bean
        public BCryptPasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }

    }