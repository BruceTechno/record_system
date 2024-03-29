package com.example.record_system.service.impl;

import com.example.record_system.constants.RtnCode;
import com.example.record_system.entity.Accounting;
import com.example.record_system.repository.AccountingDao;
import com.example.record_system.service.ifs.AccountingService;
import com.example.record_system.vo.request.AddAccountingRequest;
import com.example.record_system.vo.request.SearchAccountingRequest;
import com.example.record_system.vo.response.AddAccountingResponse;
import com.example.record_system.vo.response.SearchAccountingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class AccountingServiceImpl implements AccountingService {
    @Autowired
    private AccountingDao accountingDao;

    @Override
    public AddAccountingResponse addAccounting(AddAccountingRequest request) {
        String userId = request.getUserId();
        String date = request.getDate();
        Integer categoryId = request.getCategoryId();
        Integer cost = request.getCost();
        String thing = request.getThing();
        String ynRequire = request.getYnRequire();
        Integer inOrOut = request.getIncomeOrOutcome();
        if (!StringUtils.hasText(thing)) {
            return new AddAccountingResponse("data is empty");
        }
        if (cost <= 0 || categoryId <= 0) {
            return new AddAccountingResponse("data is error");
        }
        Accounting result = new Accounting(userId, categoryId, thing, cost, date, ynRequire, inOrOut);
        accountingDao.save(result);
        return new AddAccountingResponse(RtnCode.SUCCESSFUL.getMessage());
    }

    @Override
    public List<Map<String, Objects>> searchAccountingByConditions(HttpSession session, SearchAccountingRequest request) {
        String dateS = request.getDateS();
        String dateE = request.getDateE();
        int ctgId = request.getCtgId();
        int cost = request.getCost();
        String ynRequired = request.getYnRequired();
        String thing = request.getThing();
        List<Map<String, Objects>> result = accountingDao.searchAccountingByConditions(dateS,dateE,thing,cost,ynRequired,ctgId);
        //        List<Map<String, Objects>> result = accountingDao.searchAccountingByConditions(dateS,dateE);

        return result;
    }
}
