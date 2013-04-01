package com.logger;

import java.util.*;

public class LogEntries {

	List<LogEntry> logs = new ArrayList<LogEntry>();
	
	public List<LogEntry> getAll() {
		return logs;
	}

	public void add(LogEntry logEntry) {
		logs.add(0, logEntry);
	}

}
