package com.pykube.controller.dto;

public class AccountDTO {

	private int aid;
	private String name;
	private String email;
	private int balance;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountDTO [aid=" + aid + ", name=" + name + ", email=" + email + ", balance=" + balance + "]";
	}

}
