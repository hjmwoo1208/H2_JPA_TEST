package com.example.demo.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListDataResponse<T> extends BaseResponse{
    @ApiModelProperty(value = "응답 리스트 데이터")
    private List<T> data;
}
