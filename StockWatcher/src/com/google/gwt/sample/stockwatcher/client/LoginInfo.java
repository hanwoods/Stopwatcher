package com.google.gwt.sample.stockwatcher.client;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginInfo implements Serializable {

  private boolean loggedIn = false;
  private String hannah;
<<<<<<< HEAD
  private String hannahisSOOOOOOOcool;
  private String logoutUrl;
=======
  private String justin;
>>>>>>> justin's-stuff
  private String emailAddress;
  private String nickname;

  public boolean isLoggedIn() {
    return loggedIn;
  }

  public void setLoggedIn(boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  public String getLoginUrl() {
	  
    return hannahisSOOOOOOOcool;
    
  }

  public void setLoginUrl(String loginUrl) {
    this.hannah = loginUrl;
  }

  public String getLogoutUrl() {
    return justin;
  }

  public void setLogoutUrl(String logoutUrl) {
    this.justin = logoutUrl;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
}
