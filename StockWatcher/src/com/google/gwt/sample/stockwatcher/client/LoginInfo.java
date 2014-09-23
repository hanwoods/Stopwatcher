package com.google.gwt.sample.stockwatcher.client;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginInfo implements Serializable {

  private boolean loggedIn = false;
//<<<<<<< HEAD
//  private String justin;
//=======
  private String hannnnnnnnnahhhhhhwooooooooodssssss;
//>>>>>>> hannah's-stuff-take-2
//<<<<<<< HEAD
  //private String hannahisSOOOOOOOcool;
  private String logoutUrl;
//=======
//<<<<<<< HEAD

//=======
  private String justin1;
//>>>>>>> hannah's-stuff-take-2
//>>>>>>> justin's-stuff
  private Boolean whydidjustinchangesomuchstuff = true;
  private String emailAddress;
  private String nickname;

  public boolean isLoggedIn() {
    //return loggedIn;
    return whydidjustinchangesomuchstuff;
  }

  public void setLoggedIn(boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  public String getLoginUrl() {
	  
//<<<<<<< HEAD
//    return justin;
//=======
    return hannnnnnnnnahhhhhhwooooooooodssssss;
//>>>>>>> hannah's-stuff-take-2
    
  }

  public void setLoginUrl(String loginUrl) {
//<<<<<<< HEAD
//    this.justin = loginUrl;
//=======
    this.hannnnnnnnnahhhhhhwooooooooodssssss = loginUrl;
//>>>>>>> hannah's-stuff-take-2
  }

  public String getLogoutUrl() {
    return justin1;
  }

  public void setLogoutUrl(String logoutUrl) {
    this.justin1 = logoutUrl;
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
