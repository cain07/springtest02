package com.cain.e_xml;

public class User {

	private Integer uid;
	private String username;
	private Integer age;
	
	private Address homeAdrr;
	
	private Address gongAdrr;
	

	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getHomeAdrr() {
		return homeAdrr;
	}

	public void setHomeAdrr(Address homeAdrr) {
		this.homeAdrr = homeAdrr;
	}

	public Address getGongAdrr() {
		return gongAdrr;
	}

	public void setGongAdrr(Address gongAdrr) {
		this.gongAdrr = gongAdrr;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", age=" + age
				+ ", homeAdrr=" + homeAdrr + ", gongAdrr=" + gongAdrr + "]";
	}
	
	

}
