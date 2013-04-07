package com.logger;

import java.util.*;

public class LogEntries {

	List<LogEntry> logs = new ArrayList<LogEntry>();
	private Clock clock;
	
	public LogEntries(Clock clock) {
		this.clock = clock;
	}

	public List<LogEntry> getAll() {
		return logs;
	}

	public void add(String message) {
		LogEntry logEntry = new LogEntry(message, clock.getCurrentTime());
		logs.add(0, logEntry);
	}

}
