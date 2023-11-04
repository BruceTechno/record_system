package com.example.record_system.service.ifs;


import com.example.record_system.vo.request.AddAccountingRequest;
import com.example.record_system.vo.response.AddAccountingResponse;

public interface AccountingService {
    public AddAccountingResponse addAccounting (AddAccountingRequest request);
}
