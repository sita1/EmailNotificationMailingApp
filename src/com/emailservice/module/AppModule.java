package com.emailservice.module;

import com.emailservice.service.MailService;
import com.emailservice.serviceImpl.FacebookServiceImpl;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
	bind(MailService.class).to(FacebookServiceImpl.class);
	}

}
