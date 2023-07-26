package com.ezra.ezra_mock.controller;

import com.ezra.ezra_mock.models.RepaymentRequest;
import com.ezra.ezra_mock.models.RepaymentResponse;
import com.ezra.ezra_mock.service.RepaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ezra/v1/")
@Slf4j
public class RepaymentController {
    @Autowired
    private RepaymentService repaymentService;

    @PostMapping(value = "repayment")
    public ResponseEntity<RepaymentResponse> loanRepayment(@RequestBody RepaymentRequest repaymentRequest){
        log.info("REPAYMENT REQUEST {}", repaymentRequest);
        RepaymentResponse repaymentResponse = repaymentService.loanRepayment(repaymentRequest);
        return new ResponseEntity<>(repaymentResponse, HttpStatus.OK);
    }
}
