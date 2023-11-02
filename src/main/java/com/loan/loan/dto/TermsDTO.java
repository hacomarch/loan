package com.loan.loan.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(Include.NON_NULL) //필드 값이 null 이 아닌 경우에만 출력하도록 설정
@Getter
@Setter
@NoArgsConstructor
public class TermsDTO {

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    @Setter
    public static class Request {

        private String name;

        private String termsDetailUrl;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    @Setter
    public static class Response {

        private Long termsId;

        private String name;

        private String termsDetailUrl;

        private LocalDateTime createdAt;

        private LocalDateTime updatedAt;
    }
}