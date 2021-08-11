package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Getter
@Setter
@ApiModel
@AllArgsConstructor
@Entity
public class SALGRADE {

    @javax.persistence.Id
    @ApiModelProperty(value = "등급")
    int GRADE;

    @ApiModelProperty(value = "최소 급여")
    int LOSAL;

    @ApiModelProperty(value = "최대 급여")
    int HISAL;

    public SALGRADE() {

    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SALGRADE{");
        sb.append("GREAD=").append(GRADE);
        sb.append(", LOSAL=").append(LOSAL);
        sb.append(", HISaL=").append(HISAL);
        sb.append('}');
        return sb.toString();
    }

}
