package com.emailservice.serviceImpl;

import com.emailservice.service.MailService;

public class FacebookServiceImpl implements MailService {

	@Override
	public boolean sendMessage(String msg, String receipient) {
	System.out.println("Message send to facebook user "+receipient + "with message :"+ msg);
	return true;
	}

}
