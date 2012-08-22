package jp.kuseful.myactivitygroupsample;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class MyActivityGroupSampleActivity extends ActivityGroup {
	
	LinearLayout container;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent);
        
        container = (LinearLayout)findViewById(R.id.child);
    }
    
    public void showChild1(View v) {
    	container.removeAllViews();
    	Intent intent = new Intent(this, Child1Activity.class);
    	
    	
    	Window childActivity = getLocalActivityManager().startActivity("child1Activity", intent);
    	container.addView(childActivity.getDecorView());
    }
    
    public void showChild2(View v) {
    	container.removeAllViews();
    	Intent intent = new Intent(this, Child2Activity.class);
    	
    	
    	Window childActivity = getLocalActivityManager().startActivity("child2Activity", intent);
    	container.addView(childActivity.getDecorView());
    }
}