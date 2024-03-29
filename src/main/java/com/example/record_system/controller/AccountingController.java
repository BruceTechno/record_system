package com.example.record_system.controller;

import com.example.record_system.service.ifs.AccountingService;
import com.example.record_system.vo.request.AddAccountingRequest;
import com.example.record_system.vo.request.SearchAccountingRequest;
import com.example.record_system.vo.response.AddAccountingResponse;
import com.example.record_system.vo.response.SearchAccountingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@CrossOrigin
public class AccountingController {
    @Autowired
    private AccountingService accountingService;
    @PostMapping(value = "add_accounting")
    public AddAccountingResponse addAccounting(@RequestBody AddAccountingRequest request) {
        return accountingService.addAccounting(request);
    }
    @PostMapping(value = "search_accounting_by_conditions")
    public List<Map<String, Objects>> search(HttpSession session, @RequestBody SearchAccountingRequest request) {
        return accountingService.searchAccountingByConditions(session,request);
    }
//    @PostMapping(value = "search_accounting_by_conditions")
//    public List<SearchAccountingResponse> search(HttpSession session, @RequestBody SearchAccountingRequest request) {
//        return accountingService.searchAccountingByConditions(session,request);
//    }
}
