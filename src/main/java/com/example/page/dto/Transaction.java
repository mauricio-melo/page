package com.example.page.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
    @Builder
    public class Transaction {
        private String sequence;

        @JsonProperty("POST_DATE")
        private String day;

        @JsonProperty("TYPE")
        private String type;

        @JsonProperty("CATEGORY_CODE")
        private Integer categoryCode;

        @JsonProperty("DESCRIPTION")
        private String description;

        @JsonProperty("ORIG_PMT_AMT")
        private BigDecimal ammount;

    }