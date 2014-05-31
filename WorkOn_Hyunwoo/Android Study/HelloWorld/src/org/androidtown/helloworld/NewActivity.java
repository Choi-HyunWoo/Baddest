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

public class NewActivity extends Activity {

	// strings.xml 에서 보여지는 string 내용을 정할 수 있음
	// activity_main.xml 에서 버튼과 Text를 정할 수 있고, string을 불러올 수 있음
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newactivity);		// xml 파일은 소문자로 만들것!
		
		
		// 첫번째 버튼에 대한 처리
		Button button01 = (Button) findViewById(R.id.button01);		// Ctrl + Shift 'O' (적절한 package를 불러옴)
		button01.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// 잠깐 동안 알림 메세지를 출력하는 Toast
				Toast.makeText(getApplicationContext(), "GoBack button is clicked!", Toast.LENGTH_LONG).show();
				
				finish();		// 이 액티비티를 종료하겠다.
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
