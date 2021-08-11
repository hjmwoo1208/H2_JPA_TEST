package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ApiModel
@AllArgsConstructor
@Entity
public class DEPT {
    @Id
    @ApiModelProperty(value = "부서번호(PK)")
    int DEPTNO;

    @Column
    @ApiModelProperty(value = "부서명")
    private String DNAME;

    @Column
    @ApiModelProperty(value = "부서위치")
    private String LOC;

    public DEPT() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DEPT{");
        sb.append("DEPTNO=").append(DEPTNO);
        sb.append(", DNAME='").append(DNAME).append('\'');
        sb.append(", LOC='").append(LOC).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
