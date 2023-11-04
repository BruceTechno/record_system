package com.example.record_system.controller;

import com.example.record_system.service.ifs.AccountingService;
import com.example.record_system.vo.request.AddAccountingRequest;
import com.example.record_system.vo.response.AddAccountingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AccountingController {
    @Autowired
    private AccountingService accountingService;
    @PostMapping(value = "add_accounting")
    public AddAccountingResponse addAccounting(@RequestBody AddAccountingRequest request) {
        return accountingService.addAccounting(request);
    }
}
