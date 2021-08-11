package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

//생성 자동완성 alt + insert

@Getter
@Setter
@ApiModel
@AllArgsConstructor
@Entity
public class EMP {

    @Id
    @ApiModelProperty(value = "사원번호")
    int EMPNO;

    @Column
    @ApiModelProperty(value = "사원명")
    String ENAME;

    @Column
    @ApiModelProperty(value = "직책")
    String JOB;

    @Column
    @ApiModelProperty(value = "매니저, 직속상사")
    int MGR;

    @Column
    @ApiModelProperty(value = "고용일, 입사일")
    Date HIREDATE; //import java.sql.Date;

    @Column
    @ApiModelProperty(value = "급여")
    int SAL;

    @Column(nullable = true)
    @ApiModelProperty( value = "성과급, 커미션")
    Integer COMM;

    @Column
    @ApiModelProperty(value = "소속 부서번호")
    int DEPTNO;

    public EMP() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EMP{");
        sb.append("EMPNO=").append(EMPNO);
        sb.append(", ENAME='").append(ENAME).append('\'');
        sb.append(", JOB='").append(JOB).append('\'');
        sb.append(", MGR=").append(MGR);
        sb.append(", date='").append(HIREDATE).append('\'');
        sb.append(", SAL=").append(SAL);
        sb.append(", COMM=").append(COMM);
        sb.append(", DEPTNO=").append(DEPTNO);
        sb.append('}');
        return sb.toString();
    }
}
