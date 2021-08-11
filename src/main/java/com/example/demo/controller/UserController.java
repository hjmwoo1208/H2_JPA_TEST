package com.example.demo.controller;

import com.example.demo.dto.EMP;
import com.example.demo.response.BaseResponse;
import com.example.demo.response.SingleDataResponse;
import com.example.demo.service.ResponseService;
import com.example.demo.service.UserService;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.runtime.options.Option;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final ResponseService responseService;

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController(UserService userService, ResponseService responseService) {
        System.out.println("UserController.UserController");
        this.userService = userService;
        this.responseService = responseService;
    }

    @ApiOperation(value = "사원 조회", notes = "사원 번호로 사원 조회")
    @GetMapping("/find/{EMPNO}")
    public ResponseEntity searchEMP(@PathVariable int EMPNO){
        System.out.println("UserController.searchEMP");
       ResponseEntity entity = null;

       try {
           Optional<EMP> emp = userService.searchEMP(EMPNO);
           if(emp.isPresent()){ //isPresent() : 객체가 존재 유무를 boolean으로 반환
               SingleDataResponse response = responseService.setSingleDataResponse(true, "조회 성공", (EMP) emp.get());
               entity = ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
           }else {
               BaseResponse response = responseService.setBaseResponse(true,"데이터 없음");
               entity = ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
           }
       }catch (JpaSystemException e){

       }catch (Exception e){
           System.out.println(e);
           BaseResponse response = responseService.setBaseResponse(false, "ERROR");
            entity = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
       }
       return entity;
    }

}
