package com.ezra.ezra_mock.service.Impl;

import com.ezra.ezra_mock.models.CreateLoanRequest;
import com.ezra.ezra_mock.models.CreateLoanResponse;
import com.ezra.ezra_mock.service.LoanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoanServiceImpl implements LoanService {
    @Override
    public CreateLoanResponse createLoan(CreateLoanRequest createLoanRequest) {
        CreateLoanResponse createLoanResponse = new CreateLoanResponse("dc1d334c-5115-48b0-81cf-88f0c102725e", "1234567");
        return createLoanResponse;
    }
}
