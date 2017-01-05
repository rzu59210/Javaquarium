package com.javaquarium.beans.web;

public class LoginVO {
	private String pseudo;
	private String password;

	public LoginVO() {

	}

	public String getPseudo() {
		return this.pseudo;
	}

	public String getPassword() {
		return this.password;
	}
	
	public void setPseudo(final String login){
		this.pseudo = login;
	}
	public void setPassword(final String pwd){
		this.password = pwd;
	}
}
