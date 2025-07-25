package com.caresync.backend.caresyncbackend.config;

    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.security.config.Customizer;
    import org.springframework.security.config.annotation.web.builders.HttpSecurity;
    import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
    import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
    import org.springframework.security.web.SecurityFilterChain;

    @EnableWebSecurity
    @Configuration
    public class SecurityConfig {

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .csrf(AbstractHttpConfigurer::disable) // disable CSRF for API
                    .authorizeHttpRequests(auth -> auth
                            .anyRequest().permitAll() // allow all requests (for now)
                    )
                    .httpBasic(Customizer.withDefaults()); // enable basic auth if needed

            return http.build();
        }
    }