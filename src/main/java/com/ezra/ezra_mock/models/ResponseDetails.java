package com.ezra.ezra_mock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class ResponseDetails {
    @JsonProperty("max-qualified")
    private int maxQualified;
    @JsonProperty("queue-count")
    private int queueCount;
    @JsonProperty("in-loan-balance")
    private int inLoanBalance;
    @JsonProperty("max-loanable")
    private int maxLoanable;
    @JsonProperty("loan-balance")
    private int loanBalance;
}
