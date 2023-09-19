package com.ezra.ezra_mock.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateLoanRequest {
    @Serial
    private static final long serialVersionUID = 1L;
    private String externalId;
    @NotNull
    @NotBlank
    private String customerId;
    @NotNull private UUID productId;
    private BigDecimal loanAmount;
    private Map<String, Object> additionalProperties = new LinkedHashMap<>();
}
