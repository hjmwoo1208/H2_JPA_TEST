package com.example.demo.dto;

//생성 자동완성 alt + insert

public class EMP {
    int EMPNO;
    String ENAME;
    String JOB;
    int MGR;
    String date;
    int SAL;
    int COMM;
    int DEPTNO;

    public EMP(){}

    public EMP(int EMPNO, String ENAME, String JOB, int MGR, String date, int SAL, int COMM, int DEPTNO) {
        this.EMPNO = EMPNO;
        this.ENAME = ENAME;
        this.JOB = JOB;
        this.MGR = MGR;
        this.date = date;
        this.SAL = SAL;
        this.COMM = COMM;
        this.DEPTNO = DEPTNO;
    }

    public int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public int getMGR() {
        return MGR;
    }

    public void setMGR(int MGR) {
        this.MGR = MGR;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSAL() {
        return SAL;
    }

    public void setSAL(int SAL) {
        this.SAL = SAL;
    }

    public int getCOMM() {
        return COMM;
    }

    public void setCOMM(int COMM) {
        this.COMM = COMM;
    }

    public int getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EMP{");
        sb.append("EMPNO=").append(EMPNO);
        sb.append(", ENAME='").append(ENAME).append('\'');
        sb.append(", JOB='").append(JOB).append('\'');
        sb.append(", MGR=").append(MGR);
        sb.append(", date='").append(date).append('\'');
        sb.append(", SAL=").append(SAL);
        sb.append(", COMM=").append(COMM);
        sb.append(", DEPTNO=").append(DEPTNO);
        sb.append('}');
        return sb.toString();
    }
}
