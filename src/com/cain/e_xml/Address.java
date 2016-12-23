package com.cain.e_xml;

public class Address {

	
	private String addr;
	private Integer tel;
	
	
	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public Integer getTel() {
		return tel;
	}


	public void setTel(Integer tel) {
		this.tel = tel;
	}


	@Override
	public String toString() {
		return "Address [addr=" + addr + ", tel=" + tel + "]";
	}

	

}
