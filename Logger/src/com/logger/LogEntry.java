package com.logger;

import java.util.Date;

public class LogEntry {

	private String text;
	
	public LogEntry(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	public Date getDate() {
		return new Date(666);
	}

}
