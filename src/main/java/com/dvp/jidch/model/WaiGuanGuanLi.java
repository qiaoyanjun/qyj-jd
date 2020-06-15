package com.dvp.jidch.model;

/**
 * 外观管理
 */

public class WaiGuanGuanLi  {

    private String wjy;
    private String riqi;

    private String hphm;

    private String clpp1;
    private String jylb;

    public String getWjy() {
        return wjy;
    }

    public void setWjy(String wjy) {
        this.wjy = wjy;
    }

    public String getRiqi() {
        return riqi;
    }

    public void setRiqi(String riqi) {
        this.riqi = riqi.substring(0,4)+"-"+riqi.substring(4,6)+"-"+riqi.substring(6,8);
    }

    public String getHphm() {
        return hphm;
    }

    public void setHphm(String hphm) {
        this.hphm = hphm;
    }

    public String getClpp1() {
        return clpp1;
    }

    public void setClpp1(String clpp1) {
        this.clpp1 = clpp1;
    }

    public String getJylb() {
        return jylb;
    }

    public void setJylb(String jylb) {
        this.jylb = jylb;
    }
}
