package com.example.page.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class VTransactionResp {

    @JsonProperty("TRANSACTION_DATA")
    private List<Transaction> transactions;
}