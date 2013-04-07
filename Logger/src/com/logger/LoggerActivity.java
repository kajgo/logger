package com.logger;

import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class LoggerActivity extends Activity {
	
    private LogEntries log = new LogEntries();
        
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        log.add(new LogEntry("first entry", new Date(100)));
        log.add(new LogEntry("seond entry", new Date(200)));
        
        ListView logEntryList = (ListView)findViewById(R.id.logEntryList);
        logEntryList.setAdapter(new LogEntryAdapter(getApplicationContext(), log.getAll()));
    }
    
    public void logButtonClicked(View view) {
        EditText logMessage = (EditText)findViewById(R.id.logMessageText);
        log.add(new LogEntry(logMessage.getText().toString(), new Date(100)));
        
        ListView logEntryList = (ListView)findViewById(R.id.logEntryList);
        logEntryList.setAdapter(new LogEntryAdapter(getApplicationContext(), log.getAll()));
    }
    
    class LogEntryAdapter extends ArrayAdapter<LogEntry> {

    	private Context context;
    	private List<LogEntry> objects;
    	
		public LogEntryAdapter(Context context, List<LogEntry> objects) {
			super(context, R.layout.log_entry_item, objects);
			this.context = context;
			this.objects = objects;
		}
    	
	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	      LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	      
	      View entryView = inflater.inflate(R.layout.log_entry_item, parent, false);
	      
	      TextView textView = (TextView) entryView.findViewById(R.id.text);
	      textView.setText(this.objects.get(position).getText());
	
	      return entryView;
	    }
    
    }
    
}