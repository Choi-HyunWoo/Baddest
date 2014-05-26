package hansung.campusmap.main;

import hansung.campusmap.gonghaka.GonghakA_1;
import hansung.main.main.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.RelativeLayout;

public class CampusMain extends Activity {
	
	RelativeLayout layout = null; //CampusMap's Layout
	int layoutMargin = 50;	//to adapt to changing GridLayout's size
	
	GridLayout gl = null;	//GridLayout
	int idealCellWidth;
	int idealCellHeight;
	
	public void scaleButtonsInMap(){
		int roadwidth = 30;
		
		idealCellWidth = (int)((layout.getWidth()-layoutMargin-roadwidth)/(gl.getColumnCount()-1));
		idealCellHeight = (int)((layout.getHeight()-layoutMargin-roadwidth)/(gl.getRowCount()-1));
		Log.i("debuging","idealCell: width "+idealCellWidth+", height "+idealCellHeight);
		
		//scale buildings individually
		scaleButton((Button)findViewById(R.id.bt_NakSan), 1,2);
		scaleButton((Button)findViewById(R.id.bt_InSung), 2,1);
		scaleButton((Button)findViewById(R.id.bt_ChangEui), 2,1);
		scaleButton((Button)findViewById(R.id.bt_GongHakA), 2,1);
		//scaleButton((Button)findViewById(R.id.bt_GongHakB), 1, (float)1.7);
		scaleButton((Button)findViewById(R.id.bt_JiSun), 2,1);
		scaleButton((Button)findViewById(R.id.bt_YunGoo), 2,1);
		scaleButton((Button)findViewById(R.id.bt_MiRae), 2,1);
		scaleButton((Button)findViewById(R.id.bt_UChon), 2,1);
		scaleButton((Button)findViewById(R.id.bt_JinLi), 2,1);
		scaleButton((Button)findViewById(R.id.bt_HakSong), 1,2);
		scaleButton((Button)findViewById(R.id.bt_TamGoo), 2,1);
		scaleButton((Button)findViewById(R.id.bt_HakGun), 1,1);
		Log.i("debuging","Scaling Buildings OK");
		
		scaleButton((Button)findViewById(R.id.other_tennis), 2, (float)0.7);
		scaleButton((Button)findViewById(R.id.other_grass), 2, (float)0.7);
		//scaleButton((Button)findViewById(R.id.other_playfield), 3,2);
		Button road = (Button)findViewById(R.id.other_road);
		road.setWidth(roadwidth); road.setHeight(roadwidth);
		Log.i("debuging","Scaling Others OK");
	}
	public void scaleButton(Button bt, float timesWidth, float timesHeight){
		bt.setWidth( (int)(idealCellWidth * timesWidth) );
		bt.setHeight( (int)(idealCellHeight * timesHeight) );
	}
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campusmap);
        
        //1.to stretch building buttons in Layout
        layout = (RelativeLayout)findViewById(R.id.campusmap_layout);	//RelativeLayout
        gl = (GridLayout)findViewById(R.id.campusmap_gridlayout);		//GridLayout
        
        //Layout이 다 그려진 것인지 검사한 뒤 scaleMapButtons()실행
        gl.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {	
			@SuppressLint("NewApi")
			@Override
			public void onGlobalLayout() {
				//remove method name changed after API 16.
				if(Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN){
					gl.getViewTreeObserver().removeGlobalOnLayoutListener(this); //deprecated method
				}else{
		            gl.getViewTreeObserver().removeOnGlobalLayoutListener(this); //method for after API16
				}
				
				Log.i("debuging","Layout: width "+layout.getWidth()+", height "+layout.getHeight());
				scaleButtonsInMap(); //stretch building buttons
				
				Log.i("debuging","GridLayout: width "+gl.getWidth()+", height "+gl.getHeight());
			}
		});
        
        //2.to handle button events
        Button bt_GonghakA = (Button)findViewById(R.id.bt_GongHakA);
		bt_GonghakA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), GonghakA_1.class);
				startActivity(intent);
			}
		});
		
	}
}
