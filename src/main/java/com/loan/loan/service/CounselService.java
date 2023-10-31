package com.loan.loan.service;

import static com.loan.loan.dto.CounselDTO.Request;
import static com.loan.loan.dto.CounselDTO.Response;

public interface CounselService {

    Response create(Request request);

    Response get(Long counselId);

    Response update(Long counselId, Request request);

    void delete(Long counselId);
}
