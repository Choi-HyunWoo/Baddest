package hansung.main.main;

import hansung.campusmap.main.CampusMain;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HansungMain extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //CampusMap Button
        Button bt_CampusMap = (Button)findViewById(R.id.bt_CampusMap);
		bt_CampusMap.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), CampusMain.class);
				startActivity(intent);
				
			}
		});
		
		//Timetable Button
		Button bt_Timetable = (Button)findViewById(R.id.bt_Timetable);
    }
}
