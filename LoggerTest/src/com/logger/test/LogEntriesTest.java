package com.logger.test;

import java.util.Date;
import java.util.List;

import com.logger.Clock;
import com.logger.LogEntries;
import com.logger.LogEntry;

import junit.framework.TestCase;

public class LogEntriesTest extends TestCase {
	
	class MockClock implements Clock {
		public Date mockedDate;
		public Date getCurrentTime() {
			return mockedDate;
		}
	}

	public void testCanRetrieveEntries2() throws Exception {
		MockClock clock = new MockClock();
		
		LogEntries entries = new LogEntries(clock);
		
		clock.mockedDate = new Date(700);
		entries.add("first entry");
		clock.mockedDate = new Date(800);
		entries.add("second entry");
		
		List<LogEntry> logs = entries.getAll();
		
		assertEquals("second entry", logs.get(0).getText());
		assertTrue(new Date(800).equals(logs.get(0).getDate()));
		
		assertEquals("first entry", logs.get(1).getText());
		assertTrue(new Date(700).equals(logs.get(1).getDate()));
	}
}
