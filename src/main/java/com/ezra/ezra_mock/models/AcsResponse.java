package com.ezra.ezra_mock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AcsResponse {
    @JsonProperty("code")
    private int code;
    @JsonProperty("error-message")
    private String errorMessage;
    @JsonProperty("response")
    private ResponseDetails response;
}

