package com.ict.edu01.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {
    // 해당 값은 application.properties 에 존재해야 한다.
    @Value("${jwt.secret}")
    private String secret ; // 시크릿 키 값(비밀번호 털리면 ㅈ됨)
    @Value("${jwt.access-token-validity}")
    private long accessTokenValidity; // 접근 토큰 유효 시간
    @Value("${jwt.refresh-token-validity}")
    private long refreshTokenValidity; // 리프레시 토큰 유효 시간

    @Bean
    public JwtUtil jwtUtil(){
        return new JwtUtil(secret, accessTokenValidity,refreshTokenValidity) ;
    }
}
