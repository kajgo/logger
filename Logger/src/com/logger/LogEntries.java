package com.logger;

import java.util.*;

public class LogEntries {

	public List<LogEntry> getAll() {
		List<LogEntry> logs = new ArrayList<LogEntry>();
		logs.add(new LogEntry("second entry"));
		logs.add(new LogEntry("first entry"));
		return logs;
	}

}
