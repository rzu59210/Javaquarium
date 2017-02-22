package com.javaquarium.beans.web;

import org.apache.struts.action.ActionForm;

public class LoginVO extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String pseudo;
	private String password;

	public LoginVO() {
	}

	/*
	 * @return pseudo
	 */
	public String getPseudo() {
		return this.pseudo;
	}

	/*
	 * @return mdp
	 */
	public String getPassword() {
		return this.password;
	}

	/*
	 * @param login set login
	 */
	public void setPseudo(final String login) {
		this.pseudo = login;
	}

	/*
	 * @param pwd set password
	 */
	public void setPassword(final String pwd) {
		this.password = pwd;
	}
}
