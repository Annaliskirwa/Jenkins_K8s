package com.ezra.ezra_mock.controller;

import com.ezra.ezra_mock.models.CreateLoanRequest;
import com.ezra.ezra_mock.models.CreateLoanResponse;
import com.ezra.ezra_mock.service.LoanService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.status;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class mockStatusController {
    private final LoanService loanService;

    public mockStatusController(LoanService loanService) {
        this.loanService = loanService;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/create-loan")
    public ResponseEntity<CreateLoanResponse> createLoan(
            @Valid @RequestBody CreateLoanRequest createLoanRequest) {
        if (createLoanRequest.getCustomerId() == null){
            return status(HttpStatus.NOT_FOUND).body(loanService.createLoan(createLoanRequest));
        }else{
            return status(HttpStatus.OK).body(loanService.createLoan(createLoanRequest));
        }
    }
}
