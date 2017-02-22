package com.javaquarium.beans.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserVO extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String password;
	private String passwordRepeat;

	/**
	 * @return le login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *        login a mettre
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return le password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *           le mdp à mettre
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the passwordRepeat
	 */
	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	/**
	 * @param passwordRepeat
	 *            the passwordRepeat to set
	 */
	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	@Override
	public ActionErrors validate(final ActionMapping mapping, final HttpServletRequest request) {
		final ActionErrors errors = new ActionErrors();

		Properties properties = new Properties();
		String propertiesFileName = "ApplicationResources.properties";

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName);
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			System.err.println("property file " + propertiesFileName + "not found in the classpath");
		}

		if (StringUtils.isEmpty(getLogin())) {
			errors.add("login",
					new ActionMessage("errors.field.notFound", properties.get("message.enregistrerUser.input.name.login")));
		}
		if (StringUtils.isEmpty(getPassword())) {
			errors.add("password",
					new ActionMessage("errors.field.notFound", properties.get("message.enregistrerUser.input.name.password")));
		}
		if (StringUtils.isEmpty(getPasswordRepeat())) {
			errors.add(
					"repeatPassword",
					new ActionMessage("errors.field.notFound", properties
							.get("message.enregistrerUser.input.name.repeat_password")));
		}
		if (getPassword().length() < 4) {
			errors.add("password_too_small",
					new ActionMessage("errors.field.minlength", properties.get("message.enregistrerUser.input.name.password"),
							"4"));
		}
		if (getPassword().compareTo(getPasswordRepeat()) != 0) {
			errors.add("password_not_similar", new ActionMessage("errors.field.password.repeat"));
		}
		return errors;
}

}
