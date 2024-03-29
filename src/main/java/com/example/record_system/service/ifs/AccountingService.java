package com.example.record_system.service.ifs;


import com.example.record_system.vo.request.AddAccountingRequest;
import com.example.record_system.vo.request.SearchAccountingRequest;
import com.example.record_system.vo.response.AddAccountingResponse;
import com.example.record_system.vo.response.SearchAccountingResponse;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface AccountingService {
    //新增花費
    public AddAccountingResponse addAccounting (AddAccountingRequest request);
    // 以 分類、花費事項、花費金額、日期區間、是否必要花費作為條件 搜尋花費
//    public List<SearchAccountingResponse> searchAccountingByConditions(HttpSession session , SearchAccountingRequest request);
    public List<Map<String, Objects>> searchAccountingByConditions(HttpSession session , SearchAccountingRequest request);
}
