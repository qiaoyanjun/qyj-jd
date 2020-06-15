package com.dvp.jidch.model;

import java.io.Serializable;

public class DynWaiG implements Serializable {

    private String ID;

    private String name;

    private String ciS;

    private String jc1;
    private String jc2;
    private String jc3;
    private String jc4;

    public String getJc1() {
        return jc1;
    }

    public void setJc1(String jc1) {
        this.jc1 = jc1;
    }

    public String getJc2() {
        return jc2;
    }

    public void setJc2(String jc2) {
        this.jc2 = jc2;
    }

    public String getJc3() {
        return jc3;
    }

    public void setJc3(String jc3) {
        this.jc3 = jc3;
    }

    public String getJc4() {
        return jc4;
    }

    public void setJc4(String jc4) {
        this.jc4 = jc4;
    }

    public String getCiS() {
        return ciS;
    }

    public void setCiS(String ciS) {
        this.ciS = ciS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
