package com.logger.test;

import java.util.List;
import com.logger.LogEntries;
import com.logger.LogEntry;

import junit.framework.TestCase;

public class LogEntriesTest extends TestCase {

	public void testCanRetrieveEntries() throws Exception {
		LogEntries entries = new LogEntries();
		List<LogEntry> logs = entries.getAll();
		assertEquals("second entry", logs.get(0).getText());
		assertEquals("first entry", logs.get(1).getText());
	}
	
}
