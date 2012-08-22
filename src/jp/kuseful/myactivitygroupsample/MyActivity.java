package jp.kuseful.myactivitygroupsample;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class MyActivity extends TabActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_layout);
		
		Resources res = getResources();
		
		TabHost tabhost = getTabHost();
		
		TabHost.TabSpec spec;
		Intent intent;
		
		intent = new Intent().setClass(this, MyActivityGroupSampleActivity.class);
		spec = tabhost.newTabSpec("tab1")
				.setIndicator("Home", res.getDrawable(R.drawable.ic_tab_home))
				.setContent(intent);
		tabhost.addTab(spec);
		
		intent = new Intent().setClass(this, Tab2Activity.class);
		spec = tabhost
				.newTabSpec("tab2")
				.setIndicator("Camera",
						res.getDrawable(R.drawable.ic_tab_camera))
				.setContent(intent);
		tabhost.addTab(spec);
		
		intent = new Intent().setClass(this, Tab3Activity.class);
		spec = tabhost
				.newTabSpec("tab3")
				.setIndicator("Star", res.getDrawable(R.drawable.ic_tab_star))
				.setContent(intent);
		tabhost.addTab(spec);
		
		tabhost.setCurrentTab(0);
	}

}
