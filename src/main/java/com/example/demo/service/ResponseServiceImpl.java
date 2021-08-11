package com.example.demo.service;

import com.example.demo.response.BaseResponse;
import com.example.demo.response.ListDataResponse;
import com.example.demo.response.SingleDataResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseServiceImpl implements ResponseService{

    @Override
    public BaseResponse setBaseResponse(boolean success, String message) {
        BaseResponse response = new BaseResponse();
        response.setSuccess(success);
        response.setMassage(message);
        return response;
    }

    @Override
    public <T> SingleDataResponse<T> setSingleDataResponse(boolean success, String message, T data) {
        SingleDataResponse<T> response = new SingleDataResponse<>();
        response.setSuccess(success);
        response.setMassage(message);
        response.setData(data);
        return response;
    }

    @Override
    public <T> ListDataResponse<T> setListDataResponse(boolean success, String message, List<T> data) {
        ListDataResponse<T> response = new ListDataResponse<>();
        response.setSuccess(success);
        response.setMassage(message);
        response.setData(data);
        return response;
    }
}
