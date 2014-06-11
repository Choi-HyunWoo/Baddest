package org.androidtown.sqlitetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/*
 * 데이터베이스만 접속할 수 있는 클래스를 하나 만들어야함 (DAO 클래스)
 * DAO : Data Access Object 클래스
 */



public class DataBaseTest extends SQLiteOpenHelper {
	// 어떤 클래스를 만들던 Sqlite 데이터 베이스에 접근하려면 SQLiteOpenHelper 클래스를 상속받아야함
	public DataBaseTest(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}//SQLite를 사용하기 위해서


	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
}

/*
 * 1. 클래스를 만들고 DDMS를 실행한다.
 * 2. 실행되고있는 애뮬레이터(가상머신) 클릭 > 오른쪽 File Explorer 선택
 * 3. data> data> 작성중인 패키지 이름의 파일 > databases 폴더에 작성한 DB파일이 있음
 *    선택후 안드로이드 데이터를 PC로 가져오는 아이콘을 클릭해서 PC에 저장.
 */