package com.example.page.controller;

import com.example.page.dto.Transaction;
import com.example.page.dto.VTransactionResp;
import com.example.page.service.PageService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
@RequiredArgsConstructor
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class PageController {

    private final PageService pageService;

    @GetMapping(path = "/v1/transaction")
    public Page<Transaction> transactions(final Pageable pageable) {
        return pageService.getTransactions(pageable);
    }


}