package com.loan.loan.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//객체 간의 필드 매핑 설정
@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT); //필드 매핑 시 이름과 유형이 정확하게 일치해야 함을 설정
        modelMapper.getConfiguration().setSkipNullEnabled(true); //매핑 시 null일 경우 매핑하지 않음
        return modelMapper;
    }
}
