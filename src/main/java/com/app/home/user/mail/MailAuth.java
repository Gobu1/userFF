package com.app.home.user.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuth extends Authenticator {
	
	PasswordAuthentication pa;
    
    public MailAuth() {
        String mail_id = "gogkgngg";
        String mail_pw = "6412fd099123!";
        
        pa = new PasswordAuthentication(mail_id, mail_pw);
    }
    
    public PasswordAuthentication getPasswordAuthentication() {
        return pa;
    }

}
