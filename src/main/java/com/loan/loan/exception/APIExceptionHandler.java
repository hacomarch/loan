package com.loan.loan.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loan.loan.dto.ResponseDTO;
import com.loan.loan.dto.ResultObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice //Spring 에서 예외 처리를 담당하는 클래스라고 알려주는 어노테이션
public class APIExceptionHandler extends RuntimeException {

  @ExceptionHandler(BaseException.class) //BaseException 또는 BaseException의 하위 클래에서 발생하는 예외 처리
  protected ResponseDTO<ResultObject> handleBaseException(BaseException e,
                                                          HttpServletRequest request,
                                                          HttpServletResponse response) {
    log.error(e.getMessage(), e);
    return new ResponseDTO<>(e);
  }
}