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

	// strings.xml ���� �������� string ������ ���� �� ����
	// activity_main.xml ���� ��ư�� Textview�� ���� �� �ְ�, string�� �ҷ��� �� ����
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button01 = (Button) findViewById(R.id.button01);		// Ctrl + Shift 'O' (������ package�� �ҷ���)
		button01.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// ��� ���� �˸� �޼����� ����ϴ� Toast
				Toast.makeText(getApplicationContext(), "Start button is clicked!", Toast.LENGTH_LONG).show();
				
				// ����Ʈ�� ��ũ�� �������� ��
				Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
				startActivity(myIntent);
				
			}
			
		});
		

		Button button02 = (Button) findViewById(R.id.button02);		// Ctrl + Shift 'O' (������ package�� �ҷ���)
		button02.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "button 02 is clicked!", Toast.LENGTH_LONG).show();
				
				// ��ȭ�� �� �� �ֵ��� ��
				Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-9600-7673"));
				startActivity(myIntent);
				
			}
			
		});
	

		Button button03 = (Button) findViewById(R.id.button03);		// Ctrl + Shift 'O' (������ package�� �ҷ���)
		button03.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "button 03 is clicked!", Toast.LENGTH_LONG).show();
				
				// NewActivity �� �̵��� ���̴�.
				// Activity�� �߰��� ������ AndroidManifest.xml���� ���ο� Activity�� �����ؾ��Ѵ�.
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
