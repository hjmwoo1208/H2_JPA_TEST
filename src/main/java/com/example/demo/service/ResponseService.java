package com.example.demo.service;

import com.example.demo.response.BaseResponse;
import com.example.demo.response.ListDataResponse;
import com.example.demo.response.SingleDataResponse;

import java.util.List;

public interface ResponseService {
    public BaseResponse setBaseResponse(boolean success, String message);
    public <T> SingleDataResponse<T> setSingleDataResponse(boolean success, String message, T data);
    public <T> ListDataResponse<T> setListDataResponse(boolean success, String message, List<T> data);
}
