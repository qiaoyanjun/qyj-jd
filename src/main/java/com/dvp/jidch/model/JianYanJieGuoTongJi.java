
package com.dvp.jidch.model;

/**
 * 检验结果统计
 */

public class JianYanJieGuoTongJi  {

	/**
	 * 检验员dt
	 */

	private String jianYYdt;
	
	/**
	 * 动态检验总次数
	 */

	private int dongTJYZCSh;
	
	/**
	 * 第一次检验
	 */

	private int diYCJY;
	
	/**
	 * 第二次检验
	 */

	private int diECJY;
	
	/**
	 * 第三次检验
	 */

	private int diSCJY;
	
	/**
	 * 第四次检验
	 */

	private int diSHCJY;
	/**
	 * 外观检验总次数
	 */

	private int waiGJYZCSh;
	
	public int getDiSHCJY() {
		return diSHCJY;
	}
	public void setDiSHCJY(int diSHCJY) {
		this.diSHCJY = diSHCJY;
	}

	/**
	 * 检验人
	 */

	private String jianYR;
	
	public String getJianYYdt(){
    	return this.jianYYdt;
	}
	public void setJianYYdt(String jianYYdt){
     	this.jianYYdt=jianYYdt;
	}
	
	public int getDongTJYZCSh(){
    	return this.dongTJYZCSh;
	}
	public void setDongTJYZCSh(int dongTJYZCSh){
     	this.dongTJYZCSh=dongTJYZCSh;
	}
	
	public int getDiYCJY(){
    	return this.diYCJY;
	}
	public void setDiYCJY(int diYCJY){
     	this.diYCJY=diYCJY;
	}
	
	public int getDiECJY(){
    	return this.diECJY;
	}
	public void setDiECJY(int diECJY){
     	this.diECJY=diECJY;
	}
	
	public int getDiSCJY(){
    	return this.diSCJY;
	}
	public void setDiSCJY(int diSCJY){
     	this.diSCJY=diSCJY;
	}
	
	public int getWaiGJYZCSh(){
    	return this.waiGJYZCSh;
	}
	public void setWaiGJYZCSh(int waiGJYZCSh){
     	this.waiGJYZCSh=waiGJYZCSh;
	}
	
	public String getJianYR(){
    	return this.jianYR;
	}
	public void setJianYR(String jianYR){
     	this.jianYR=jianYR;
	}

	}
