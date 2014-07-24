package com.apress.prospring3.ch4;

import com.apress.prospring3.ch2.MessageProvider;

public interface MessageRenderer {
	public void render();

	public void setMessageProvider(MessageProvider provider);

	public MessageProvider getMessageProvider();
}