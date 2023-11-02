package com.loan.loan.service;

import com.loan.loan.dto.TermsDTO.*;

import java.util.List;

public interface TermsService {

    Response create(Request request);

    List<Response> getAll();
}
