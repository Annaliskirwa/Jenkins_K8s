package com.ezra.ezra_mock.service;

import com.ezra.ezra_mock.models.RepaymentRequest;
import com.ezra.ezra_mock.models.RepaymentResponse;
import org.springframework.stereotype.Service;

@Service
public interface RepaymentService {
    RepaymentResponse loanRepayment(RepaymentRequest repaymentRequest);
}
