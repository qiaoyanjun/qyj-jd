
package com.dvp.jidch.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 动态管理
 */
public class DongTaiGuanLi {
	private String id;
	private String name;
	private String riqi;
	private String hphm;
	private String hpzl;
	private String jycs;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getHpzl() {
		return hpzl;
	}

	public void setHpzl(String hpzl) {
		this.hpzl = hpzl;
	}

	public String getJycs() {
		return jycs;
	}

	public void setJycs(String jycs) {
		this.jycs = jycs;
	}
}
