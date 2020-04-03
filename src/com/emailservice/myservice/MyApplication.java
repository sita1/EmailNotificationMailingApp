package com.emailservice.myservice;

import javax.inject.Inject;

import com.emailservice.service.MailService;

public class MyApplication {
	
	private MailService mailService;

	@Inject
	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}
	
	public boolean sendMessage(String msg, String recipient)
	{
		return mailService.sendMessage(msg, recipient);
	}
	
	

}
