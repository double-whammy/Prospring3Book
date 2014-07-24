package com.apress.prospring3.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring3.ch2.MessageProvider;

public class DeclareSpringComponents {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-xml.xml");
		ctx.refresh();
		MessageProvider messageProvider = ctx.getBean("messageProvider",
				MessageProvider.class);
		System.out.println(messageProvider.getMessage());
	}
}
