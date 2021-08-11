package com.example.demo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class BaseResponse {
    @ApiModelProperty(value = "요청 성공 유무")
    private boolean success;
    @ApiModelProperty(value = "응답 메세지")
    private String massage;
}
