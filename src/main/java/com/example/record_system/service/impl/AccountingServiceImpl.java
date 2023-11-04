package com.example.record_system.service.impl;

import com.example.record_system.constants.RtnCode;
import com.example.record_system.entity.Accounting;
import com.example.record_system.repository.AccountingDao;
import com.example.record_system.service.ifs.AccountingService;
import com.example.record_system.vo.request.AddAccountingRequest;
import com.example.record_system.vo.response.AddAccountingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;

@Service
public class AccountingServiceImpl implements AccountingService {
    @Autowired
    private AccountingDao accountingDao;

    @Override
    public AddAccountingResponse addAccounting(AddAccountingRequest request) {
        String userId = request.getUserId();
        LocalDate date = request.getDate();
        Integer categoryId = request.getCategoryId();
        Integer cost = request.getCost();
        String thing = request.getThing();
        boolean isRequire = request.isRequire();
        Integer inOrOut = request.getIncomeOrOutcome();
        if (!StringUtils.hasText(thing)) {
            return new AddAccountingResponse("data is empty");
        }
        if (cost <= 0 || categoryId <= 0) {
            return new AddAccountingResponse("data is error");
        }
        Accounting result = new Accounting(userId, categoryId, thing, cost, date, isRequire, inOrOut);
        accountingDao.save(result);
        return new AddAccountingResponse(RtnCode.SUCCESSFUL.getMessage());
    }
}
