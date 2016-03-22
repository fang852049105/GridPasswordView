package com.kayak.hh;

import com.jungly.gridpasswordview.GridPasswordView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	private GridPasswordView gridPasswordView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gridPasswordView = (GridPasswordView) findViewById(R.id.gv);
		gridPasswordView.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.gv:
			Toast.makeText(this, gridPasswordView.getPassWord()+"", 0).show();
			
			break;

		default:
			break;
		}
	}

}
