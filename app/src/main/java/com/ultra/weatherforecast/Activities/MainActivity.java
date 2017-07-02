package com.ultra.weatherforecast.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.ultra.weatherforecast.R;

public class MainActivity extends AppCompatActivity
	{
	public static int currentFragment;

	private class BtnListener implements View.OnClickListener
		{
		@Override
		public void onClick(View v)
			{
			if(v.getId()==R.id.btnSearch)
				{
				Intent jumper= new Intent(MainActivity.this,SearchActivity.class);
				jumper.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
				startActivity(jumper);
				}
			else if(v.getId()==R.id.btnLocalWeather)
				{
				Intent jumper= new Intent(MainActivity.this,LocalActivity.class);
				startActivity(jumper);
				}
			}
		}
	@Override
	protected void onCreate(Bundle savedInstanceState)
		{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);

		Button btnSearch= (Button)findViewById(R.id.btnSearch);
		Button btnLocalWeather= (Button)findViewById(R.id.btnLocalWeather);

		btnSearch.setOnClickListener(new BtnListener() );
		btnLocalWeather.setOnClickListener(new BtnListener() );
		}
	}
