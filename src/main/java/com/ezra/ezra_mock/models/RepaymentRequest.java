package com.ezra.ezra_mock.models;

import lombok.Data;

@Data
public class RepaymentRequest {
    private String msisdn;
    private String meterNumber;
    private String referenceID;
    private Integer amount;
}
