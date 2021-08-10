package com.example.demo.dto;

public class DEPT {
    int DEPTNO;
    String DNAME;
    String LOC;

    public DEPT() {}

    public DEPT(int DEPTNO, String DNAME, String LOC) {
        this.DEPTNO = DEPTNO;
        this.DNAME = DNAME;
        this.LOC = LOC;
    }

    public int getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    public String getDNAME() {
        return DNAME;
    }

    public void setDNAME(String DNAME) {
        this.DNAME = DNAME;
    }

    public String getLOC() {
        return LOC;
    }

    public void setLOC(String LOC) {
        this.LOC = LOC;
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
