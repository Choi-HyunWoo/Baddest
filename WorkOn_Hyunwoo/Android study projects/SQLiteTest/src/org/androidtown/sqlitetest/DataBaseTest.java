package org.androidtown.sqlitetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/*
 * �����ͺ��̽��� ������ �� �ִ� Ŭ������ �ϳ� �������� (DAO Ŭ����)
 * DAO : Data Access Object Ŭ����
 */



public class DataBaseTest extends SQLiteOpenHelper {
	// � Ŭ������ ����� Sqlite ������ ���̽��� �����Ϸ��� SQLiteOpenHelper Ŭ������ ��ӹ޾ƾ���
	public DataBaseTest(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}//SQLite�� ����ϱ� ���ؼ�


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
 * 1. Ŭ������ ����� DDMS�� �����Ѵ�.
 * 2. ����ǰ��ִ� �ֹķ�����(����ӽ�) Ŭ�� > ������ File Explorer ����
 * 3. data> data> �ۼ����� ��Ű�� �̸��� ���� > databases ������ �ۼ��� DB������ ����
 *    ������ �ȵ���̵� �����͸� PC�� �������� �������� Ŭ���ؼ� PC�� ����.
 */