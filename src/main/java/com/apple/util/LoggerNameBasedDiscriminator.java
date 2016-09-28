package com.apple.util;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.sift.Discriminator;

public class LoggerNameBasedDiscriminator implements Discriminator<ILoggingEvent> {

	private static final String KEY = "logFileName";

	private boolean started;

	@Override
	public String getDiscriminatingValue(ILoggingEvent iLoggingEvent) {
//		System.out.println("inside getDiscriminatingValue : "+ iLoggingEvent.getLoggerName());
//		System.out.println(iLoggingEvent.getLoggerName().startsWith("com.apple."));
		if(iLoggingEvent.getLoggerName().startsWith("com.apple.")) {
			return "application";
		} else {
			return "others";
		}
	}

	@Override
	public String getKey() {
		System.out.println("inside getKey : "+ KEY);
		return KEY;
	}

	public void start() {
		started = true;
	}

	public void stop() {
		started = false;
	}

	public boolean isStarted() {
		return started;
	}
}