package com.loan.loan.service;

import com.loan.loan.domain.Application;
import com.loan.loan.dto.ApplicationDTO;
import com.loan.loan.repository.ApplicationRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

import static com.loan.loan.dto.ApplicationDTO.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ApplicationServiceTest {

    @InjectMocks ApplicationServiceImpl applicationService;
    @Mock ApplicationRepository applicationRepository;
    @Spy private ModelMapper modelMapper;

    @Test
    void Should_ReturnResponseOfNewApplyEntity_When_RequestApply() {
        Application entity = Application.builder()
                .name("haeun")
                .cellPhone("010-1111-1111")
                .email("mail@naver.com")
                .hopeAmount(BigDecimal.valueOf(500000000))
                .build();

        Request request = Request.builder()
                .name("haeun")
                .cellPhone("010-1111-1111")
                .email("mail@abc.de")
                .hopeAmount(BigDecimal.valueOf(500000000))
                .build();

        when(applicationRepository.save(any(Application.class))).thenReturn(entity);

        Response actual = applicationService.create(request);

        assertThat(actual.getName()).isSameAs(entity.getName());
    }
}