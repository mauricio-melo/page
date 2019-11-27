package com.example.page.service;

import com.example.page.dto.Transaction;
import com.example.page.dto.VTransactionResp;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class PageService {

    public Page<Transaction> getTransactions(final Pageable pageable){
        List<Transaction> transactions = new ArrayList<>();
        for (int i = 0; i < 30; i++ ) {
            Transaction transaction = Transaction.builder()
                    .ammount(BigDecimal.TEN)
                    .categoryCode(i)
                    .day("20102019")
                    .description("Boliviano")
                    .type("Compra")
                    .build();

            transactions.add(transaction);
        }
        return new PageImpl<>(transactions, pageable, transactions.size());
    }
}
