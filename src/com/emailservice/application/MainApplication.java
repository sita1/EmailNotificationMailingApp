package com.emailservice.application;

import com.emailservice.module.AppModule;
import com.emailservice.myservice.MyApplication;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainApplication {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppModule());		
		
		MyApplication app = injector.getInstance(MyApplication.class);
		
		app.sendMessage("Hi Sita", "sitasharma853@gmail.com");
	}

}
