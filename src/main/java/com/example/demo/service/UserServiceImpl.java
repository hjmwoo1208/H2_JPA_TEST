package com.example.demo.service;

import com.example.demo.dto.EMP;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<EMP> searchEMP(int EMPNO) throws Exception {
        System.out.println("UserServiceImpl.searchEMP");
        Optional<EMP> emp = userRepository.findEMPByEMPNO(EMPNO);
        return emp;
    }
}
