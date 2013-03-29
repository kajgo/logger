package com.logger;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.*;

public class LoggerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListView logEntryList = (ListView)findViewById(R.id.logEntryList);
        logEntryList.setAdapter(new LogEntryAdapter(getApplicationContext(), new LogEntries().getAll()));
    }
    
    class LogEntryAdapter extends ArrayAdapter<LogEntry> {

		public LogEntryAdapter(Context context, List<LogEntry> objects) {
			super(context, R.layout.log_entry_item, R.id.text, objects);
		}
    	
    }
}