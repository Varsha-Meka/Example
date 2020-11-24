package com.showallbackgroundprocess_android_examples.com;

import java.util.List;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView textview;
	ActivityManager activitymanager;
	Context context;
	List<ActivityManager.RunningAppProcessInfo> RAP ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textview = (TextView)findViewById(R.id.textView1);
        
        context = getApplicationContext();
        
        activitymanager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        
        RAP = activitymanager.getRunningAppProcesses();
        
        for(ActivityManager.RunningAppProcessInfo processInfo: RAP ){
            
            textview.setText(textview.getText() + processInfo.processName + "\n");
              
        }
        
    }
}
