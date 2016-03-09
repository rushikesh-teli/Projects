package com.igate.tradingsimulator.service;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class BaseService implements MessageSourceAware {

	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
