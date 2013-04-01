package com.logger.test;

import java.util.Date;
import java.util.List;

import com.logger.LogEntries;
import com.logger.LogEntry;

import junit.framework.TestCase;

public class LogEntriesTest extends TestCase {

	public void testCanRetrieveEntries() throws Exception {
		LogEntries entries = new LogEntries();
		
		entries.add(new LogEntry("first entry", new Date(700)));
		entries.add(new LogEntry("second entry", new Date(800)));
		
		List<LogEntry> logs = entries.getAll();
		
		assertEquals("second entry", logs.get(0).getText());
		assertTrue(new Date(800).equals(logs.get(0).getDate()));
		
		assertEquals("first entry", logs.get(1).getText());
		assertTrue(new Date(700).equals(logs.get(1).getDate()));
	}
	
}
