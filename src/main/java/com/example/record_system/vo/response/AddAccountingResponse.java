package com.example.record_system.vo.response;

public class AddAccountingResponse {
    private String message;
//==

    public AddAccountingResponse() {
    }

    public AddAccountingResponse(String message) {
        this.message = message;
    }
//==

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
