package com.logger;

import java.util.Date;

public class LogEntry {

	private String text;
	private Date date;
	
	public LogEntry(String text, Date date) {
		this.text = text;
		this.date = date;
	}
	
	public String getText() {
		return text;
	}

	public Date getDate() {
		return date;
	}

}
