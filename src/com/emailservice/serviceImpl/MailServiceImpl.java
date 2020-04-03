package com.emailservice.serviceImpl;

import javax.inject.Singleton;

import com.emailservice.service.MailService;

@Singleton
public class MailServiceImpl implements MailService{

	@Override
	public boolean sendMessage(String msg, String receipient) {
		System.out.println("Email Message sent to "+receipient+" with message="+msg);
		return true;
	}

}
