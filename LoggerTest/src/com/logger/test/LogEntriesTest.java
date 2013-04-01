package com.logger.test;

import java.util.Date;
import java.util.List;

import com.logger.LogEntries;
import com.logger.LogEntry;

import junit.framework.TestCase;

public class LogEntriesTest extends TestCase {

	public void testCanRetrieveEntries() throws Exception {
		LogEntries entries = new LogEntries();
		List<LogEntry> logs = entries.getAll();
		Date d = new Date(666);
		assertEquals("second entry", logs.get(0).getText());
		assertTrue(d.equals(logs.get(0).getDate()));
		assertEquals("first entry", logs.get(1).getText());
		assertTrue(d.equals(logs.get(1).getDate()));
	}
	
}
