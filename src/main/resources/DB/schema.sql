DROP table EMP if exists ;
CREATE TABLE EMP
(
    EMPNO int(4) not null,
    ENAME VARCHAR(10),
    JOB VARCHAR(9),
    MGR int(4) ,
    HIREDATE date,
    SAL decimal ,
    COMM decimal ,
    DEPTNO int
);

DROP table DEPT if exists ;
CREATE TABLE DEPT
(
    DEPTNO int,
    DNAME VARCHAR(14),
    LOC VARCHAR(13)
);

drop table SALGRADE if exists ;
CREATE TABLE SALGRADE
(
    GRADE int,
    LOSAL decimal,
    HISAL decimal
);