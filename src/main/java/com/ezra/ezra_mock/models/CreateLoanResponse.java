package com.ezra.ezra_mock.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record CreateLoanResponse(String loanId, String externalId) {}
