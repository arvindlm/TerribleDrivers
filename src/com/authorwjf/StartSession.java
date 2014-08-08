package com.authorwjf;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class StartSession extends Activity{
	Button startSession;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_session);
        init();
    }
	
	public void init() {
		startSession = (Button)findViewById(R.id.button3);
		startSession.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				callMain();
				
			}
		});
	}
	
	public void callMain(){
		Intent intent=new Intent(this, Main.class);
		startActivity(intent);
	}

}
