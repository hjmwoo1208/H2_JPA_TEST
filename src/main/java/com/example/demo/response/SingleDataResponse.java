package com.example.demo.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SingleDataResponse<T> extends BaseResponse{
    @ApiModelProperty(value = "응답 단일 데이터")
    private T data;
}
