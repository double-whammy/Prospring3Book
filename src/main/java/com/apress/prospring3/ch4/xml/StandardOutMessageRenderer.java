package com.apress.prospring3.ch4.xml;

import com.apress.prospring3.ch2.MessageProvider;
import com.apress.prospring3.ch4.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider = null;

	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
					"You must set the property messageProvider of class:"
							+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
}