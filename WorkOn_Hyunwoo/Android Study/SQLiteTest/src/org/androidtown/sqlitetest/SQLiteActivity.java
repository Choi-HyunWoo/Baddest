/* 소스코드 내에서 데이터베이스를 만들고
      테이블을 만들어서 데이터를 넣는 방법  */

package org.androidtown.sqlitetest;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SQLiteActivity extends Activity implements OnClickListener {
	EditText nameet, passet, addresset, emailet;	//텍스트변수 선언
	Button	inputbt, updatebt, deletebt, searchbt, allmemberbt;		// 버튼변수 선언
	DataBaseTest db;	// 아까 만든 java class 객체로 database를 가져올것임
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sqlite);
		
		//xml로부터 객체 생성
		nameet = (EditText) findViewById(R.id.nameet);
		passet = (EditText) findViewById(R.id.passet);
		addresset= (EditText) findViewById(R.id.addresset);
		emailet= (EditText) findViewById(R.id.emailet);
		
		inputbt = (Button) findViewById(R.id.inputbt);
		updatebt = (Button) findViewById(R.id.updatebt);
		deletebt = (Button) findViewById(R.id.deletebt);
		searchbt = (Button) findViewById(R.id.searchbt);
		allmemberbt = (Button) findViewById(R.id.allmemberbt);
		
		//이벤트 부역
		inputbt.setOnClickListener(this);
		updatebt.setOnClickListener(this);
		deletebt.setOnClickListener(this);
		searchbt.setOnClickListener(this);
		allmemberbt.setOnClickListener(this);
		
		// 데이터베이스 객체 선언
		//db = new DataBaseTest(this);
		
	}
	
	@Override
	public void onClick(View v) {
		String name = ""; 		String pass = "";
		String address = "";	String email = "";
		
		if(v.getId()== R.id.inputbt) {
			// 각각의 텍스트 필드에서 데이터를 읽어들임
			name = nameet.getText().toString().trim();
			pass = passet.getText().toString().trim();
			address = addresset.getText().toString().trim();
			email = emailet.getText().toString().trim();
			
			// 읽어들인 데이터를 데이터베이스에 저장			
			db.insertMember(name, pass, address, email);
			
		}else if(v.getId()==R.id.updatebt){
		}else if(v.getId()==R.id.deletebt){
		}else if(v.getId()==R.id.searchbt){
		}else if(v.getId()==R.id.allmemberbt){
			ArrayList<String> namevec = null;
			
			// 디비 실행후 결과가 벡터에 저장
			namevec = db.allMemberSearh();
			// 새로운 액티비티 설정
			Intent intent = new Intent().setClass(this, AllMemberList.class);
			// 데이터를 넘겨줘
			intent.putStringArrayListExtra("name", namevec);
			// 새로운 화면을 띄우시오
			startActivity(intent);
		}
	
	
	}
	
	

}
