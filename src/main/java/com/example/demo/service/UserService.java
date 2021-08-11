package com.example.demo.service;

import com.example.demo.dto.EMP;

import java.util.Optional;

public interface UserService {
    public Optional<EMP> searchEMP(int EMPNO) throws Exception;
}
