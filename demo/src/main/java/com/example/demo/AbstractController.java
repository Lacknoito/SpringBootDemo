package com.example.demo;

import com.example.demo.common.security.model.response.ResponsePresent;

public abstract class AbstractController {
    protected ResponsePresent responseOK(Object data,String message){
        ResponsePresent present = new ResponsePresent();
        return present.sendOk(data,message);
    }
    protected ResponsePresent responseOK(Object data){
        ResponsePresent present = new ResponsePresent();
        return present.sendOk(data);
    }

    protected ResponsePresent responseError(String message){
        ResponsePresent present = new ResponsePresent();
        return present.sendError(message);
    }
}
