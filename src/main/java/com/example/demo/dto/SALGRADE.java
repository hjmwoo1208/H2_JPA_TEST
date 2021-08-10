package com.example.demo.dto;

import java.math.BigDecimal;

public class SALGRADE {
    int GREAD;
    int LOSAL;
    int HISaL;

    public SALGRADE() {}

    public SALGRADE(int GREAD, int LOSAL, int HISaL) {
        this.GREAD = GREAD;
        this.LOSAL = LOSAL;
        this.HISaL = HISaL;
    }

    public int getGREAD() {
        return GREAD;
    }

    public void setGREAD(int GREAD) {
        this.GREAD = GREAD;
    }

    public int getLOSAL() {
        return LOSAL;
    }

    public void setLOSAL(int LOSAL) {
        this.LOSAL = LOSAL;
    }

    public int getHISaL() {
        return HISaL;
    }

    public void setHISaL(int HISaL) {
        this.HISaL = HISaL;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SALGRADE{");
        sb.append("GREAD=").append(GREAD);
        sb.append(", LOSAL=").append(LOSAL);
        sb.append(", HISaL=").append(HISaL);
        sb.append('}');
        return sb.toString();
    }
}
