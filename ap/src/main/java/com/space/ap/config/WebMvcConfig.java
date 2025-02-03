package com.space.ap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 全てのエンドポイントに対してCORSを有効にする
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")  // Vue.jsのURL
                .allowedMethods("*")
                .allowCredentials(true);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // リクエストの認証・認可を設定する部分
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/api/log").permitAll()  // /api/logへのアクセスは許可
                .anyRequest().authenticated());  // その他のリクエストには認証を要求
        return http.build();
    }
}
