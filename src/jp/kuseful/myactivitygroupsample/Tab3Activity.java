package jp.kuseful.myactivitygroupsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Tab3Activity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView text = new TextView(this);
		text.setText("Tab3");
		
		setContentView(text);
	}
}
