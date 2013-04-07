package com.logger;

import java.util.Calendar;
import java.util.Date;

public class SystemClock implements Clock {
	public Date getCurrentTime() {
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		return now;
	}
}
