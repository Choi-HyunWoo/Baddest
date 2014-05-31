package org.androidtown.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	// strings.xml 에서 보여지는 string 내용을 정할 수 있음
	// activity_main.xml 에서 버튼과 Textview를 정할 수 있고, string을 불러올 수 있음
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button01 = (Button) findViewById(R.id.button01);		// Ctrl + Shift 'O' (적절한 package를 불러옴)
		button01.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// 잠깐 동안 알림 메세지를 출력하는 Toast
				Toast.makeText(getApplicationContext(), "Start button is clicked!", Toast.LENGTH_LONG).show();
				
				// 사이트의 링크로 들어가지도록 함
				Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
				startActivity(myIntent);
				
			}
			
		});
		

		Button button02 = (Button) findViewById(R.id.button02);		// Ctrl + Shift 'O' (적절한 package를 불러옴)
		button02.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "button 02 is clicked!", Toast.LENGTH_LONG).show();
				
				// 전화도 걸 수 있도록 함
				Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-9600-7673"));
				startActivity(myIntent);
				
			}
			
		});
	

		Button button03 = (Button) findViewById(R.id.button03);		// Ctrl + Shift 'O' (적절한 package를 불러옴)
		button03.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "button 03 is clicked!", Toast.LENGTH_LONG).show();
				
				// NewActivity 로 이동할 것이다.
				// Activity를 추가할 때에는 AndroidManifest.xml에서 새로운 Activity를 선언해야한다.
				Intent myIntent = new Intent(getApplicationContext(), NewActivity.class);
				startActivity(myIntent);
				
			}
			
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
