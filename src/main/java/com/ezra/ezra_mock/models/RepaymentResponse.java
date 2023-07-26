package com.ezra.ezra_mock.models;

import lombok.Data;

@Data
public class RepaymentResponse {
    private String msisdn;
    private String meterNumber;
    private String referenceID;
    private Integer amount;
    private String Status;
}
