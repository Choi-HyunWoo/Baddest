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

	// strings.xml ���� �������� string ������ ���� �� ����
	// activity_main.xml ���� ��ư�� Text�� ���� �� �ְ�, string�� �ҷ��� �� ����
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newactivity);		// xml ������ �ҹ��ڷ� �����!
		
		
		// ù��° ��ư�� ���� ó��
		Button button01 = (Button) findViewById(R.id.button01);		// Ctrl + Shift 'O' (������ package�� �ҷ���)
		button01.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// ��� ���� �˸� �޼����� ����ϴ� Toast
				Toast.makeText(getApplicationContext(), "GoBack button is clicked!", Toast.LENGTH_LONG).show();
				
				finish();		// �� ��Ƽ��Ƽ�� �����ϰڴ�.
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
