package com.netease.qa.emmagee.utils;

import javax.mail.*;

/**
 * Customized Authenticator
 * 
 */
public class CustomizedAuthenticator extends Authenticator {
	String userName = null;
	String password = null;

	public CustomizedAuthenticator() {
	}

	public CustomizedAuthenticator(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}
}
