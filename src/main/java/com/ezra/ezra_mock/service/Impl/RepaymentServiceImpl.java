package com.ezra.ezra_mock.service.Impl;

import com.ezra.ezra_mock.models.RepaymentRequest;
import com.ezra.ezra_mock.models.RepaymentResponse;
import com.ezra.ezra_mock.service.RepaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RepaymentServiceImpl implements RepaymentService {
    @Override
    public RepaymentResponse loanRepayment(RepaymentRequest repaymentRequest) {
        RepaymentResponse repaymentResponse = new RepaymentResponse();
        repaymentResponse.setAmount(1000);
        repaymentResponse.setMeterNumber("120247939745");
        repaymentResponse.setMsisdn("7234895");
        repaymentResponse.setReferenceID("12345678");
        repaymentResponse.setStatus("Success");
        log.info("REPAYMENT RESPONSE {}", repaymentResponse);
        return repaymentResponse;
    }
}
