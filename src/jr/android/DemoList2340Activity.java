package jr.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DemoList2340Activity extends Activity {
	public static final String[] todoList = {
		"Grocery Shopping",
		"Pick up laundry",
		"CS 2340 Homework"
	};
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView view = (ListView)findViewById(R.id.listView1);
        view.setAdapter(new EnhancedListAdapter(this, todoList));
    }
}