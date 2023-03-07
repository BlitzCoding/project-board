package com.fastcampus.projectboard.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configurable
@EnableJpaAuditing
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware()
    {
        // TODO: 스프링 시큐리티를 사용할때 수정해야함
        return () -> Optional.of("yong");
    }
}
