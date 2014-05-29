안드로이드에서 데이터베이스 다루기 : 데이터베이스 어댑터

데이터베이스를 생성하고, 열고, 데이터베이스에 데이터를 넣고, 쿼리를 통해서 데이터베이스에서 정보를 받아오는
작업은 SQLiteDatabase(android.database.sqlite.SQLiteDatabase) 와 SQLiteOpenHelper(android.database.sqlite.SQLiteOpenHelper) 
내의 메소드를 통해 처리됩니다. 
SQLiteDatabase 클래스에서는 데이터베이스를 다루는 작업(추가, 삭제, 수정, 쿼리)를 담당하고, SQLiteOpenHelper 클래스에스는
데이터베이스의 생성, 열기, 업그레이드를 담당합니다.





데이터베이스에서 원하는 자료를 받아오기 : 쿼리(query; 질의)

데이터베이스를 생성하고 자료를 추가하는 것 못지않게 중요한 것이 바로 자신이 원하는 데이터베이스를 가져오는 것입니다. 
이는 쿼리(Query; 질의)를 통해 이루어집니다. 질의 결과는 Cursor객체 형태로 반환됩니다.

예)
public Cursor query (String table, String[] columns, String selection, String[] selectionArgs, String groupBy,
                                      String having, String orderBy, String limit) 

table         질의를 수행할 테이블 이름입니다.
columns       자료를 받아올 필드들입니다. null을 입력하면 모든 필드를 반환합니다.
selection     SQL의 "where" 구문에 해당되는 조건을 입력합니다. 조건이 많을 경우, ?로 대체합니다.
selectionArgs   selection을 ?로 지정하였을 경우, 그 조건들을 입력합니다.
groupBy       SQL의 "group by"구문에 해당합니다.
having        groupBy를 지정했을 경우, 그 조건을 넣어줍니다.
orderBy       결과값 정렬 방식을 지정합니다. null을 입력하면 기본 정렬(오름차순)을 수행합니다.
limit         결과값의 개수를 제한합니다.





데이터베이스에서 코드로 데이터 가져오기 : Cursor

데이터베이스에서 자료를 가져올때는 그 자료가 특정한 값 하나(예:건물명)가 될 수 있고, 레코드가 될 수 있다.
혹은 전체 데이터가 될 수 도있다. 어쨌든 데이터를 가져오기 위해서는 Cursor 인터페이스를 사용한다.

<Cursor 인터페이스의 주요 메소드>
moveToFirst     커서가 쿼리(질의) 결과 레코드들 중에서 가장 처음에 위치한 레코드를 가리키도록 합니다.
moveToNext      다음 레코드로 커서를 이동합니다.
moveToPrevious  이전 레코드로 커서를 이동합니다.
getCount        질의 결과값(레코드)의 갯수를 반환합니다.
getColumnName   특정 인덱스값에 해당하는 필드 이름을 반환합니다.
getColumnNames  필드 이름들을 String 배열 형태로 반환합니다.
moveToPosition  커서를 특정 레코드로 이동시킵니다.
getPosition     커서가 현재 가리키고 있는 위치를 반환합니다.
getColumnIndexOrThrow  특정 필드의 인덱스값을 반환하며, 필드가 존재하지 않을경우 예외를 발생시킵니다.

