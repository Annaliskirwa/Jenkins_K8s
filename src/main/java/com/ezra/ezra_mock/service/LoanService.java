package com.ezra.ezra_mock.service;

import com.ezra.ezra_mock.models.CreateLoanRequest;
import com.ezra.ezra_mock.models.CreateLoanResponse;
import org.springframework.stereotype.Service;

@Service
public interface LoanService {
    CreateLoanResponse createLoan(CreateLoanRequest createLoanRequest);
}
