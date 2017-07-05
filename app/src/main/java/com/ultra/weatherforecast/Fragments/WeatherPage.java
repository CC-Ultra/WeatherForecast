package com.ultra.weatherforecast.Fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.ultra.weatherforecast.R;
import com.ultra.weatherforecast.Utils.O;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p></p>
 * <p><sub>(03.07.2017)</sub></p>
 *
 * @author CC-Ultra
 */

public class WeatherPage extends Fragment
	{
	private String city;
	private Date date;
	private String dayInfo, nightInfo;
	private String dayPic,nightPic;
	private Bundle initBundle=null;

	public void init(Bundle _initBundle)
		{
		initBundle=_initBundle;
		}
	private void initValues(Bundle dataSrc)
		{
		city= dataSrc.getString(O.mapKeys.savedState.CITY,"");
		date= new Date(dataSrc.getLong(O.mapKeys.savedState.DATE,0) );
		dayInfo= dataSrc.getString(O.mapKeys.savedState.DAY_INFO,"");
		nightInfo= dataSrc.getString(O.mapKeys.savedState.NIGHT_INFO,"");
		dayPic= dataSrc.getString(O.mapKeys.savedState.DAY_PIC,"");
		nightPic= dataSrc.getString(O.mapKeys.savedState.NIGHT_PIC,"");
		}
	private String dateStr(Date date)
		{
		SimpleDateFormat format= new SimpleDateFormat("d MMM yyyy");
		return format.format(date);
		}
	public int dpToPx(int dp)
		{
		float scale= getContext().getResources().getDisplayMetrics().density;
		return (int)(dp * scale + 0.5f);
		}
	private void loadImg(String picSrc,ImageView img)
		{
		Picasso pablo= Picasso.with(getContext() );
		RequestCreator picControl= pablo.load(picSrc);
		picControl.resize(dpToPx(50),dpToPx(50) );
		picControl.centerInside();
		picControl.into(img);
		}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState)
		{
		View mainView= inflater.inflate(R.layout.weather_page_layout,container,false);
		Bundle dataSrc=new Bundle();
		if(initBundle!=null)
			dataSrc=initBundle;
		if(savedInstanceState!=null)
			dataSrc=savedInstanceState;
		initValues(dataSrc);

		TextView txtDate= (TextView)mainView.findViewById(R.id.date);
		TextView txtCity= (TextView)mainView.findViewById(R.id.city);
		TextView txtDayInfo= (TextView)mainView.findViewById(R.id.dayInfo);
		TextView txtNightInfo= (TextView)mainView.findViewById(R.id.nightInfo);
		ImageView imgDayPic= (ImageView)mainView.findViewById(R.id.dayPic);
		ImageView imgNightPic= (ImageView)mainView.findViewById(R.id.nightPic);

		txtCity.setText(city);
		txtDate.setText(dateStr(date) );
		txtDayInfo.setText(dayInfo);
		txtNightInfo.setText(nightInfo);

		loadImg(dayPic,imgDayPic);
		loadImg(nightPic,imgNightPic);

		return mainView;
		}

	@Override
	public void onSaveInstanceState(Bundle outState)
		{
		outState.putString(O.mapKeys.savedState.CITY,city);
		outState.putLong(O.mapKeys.savedState.DATE,date.getTime() );
		outState.putString(O.mapKeys.savedState.DAY_INFO,dayInfo);
		outState.putString(O.mapKeys.savedState.NIGHT_INFO,nightInfo);
		outState.putString(O.mapKeys.savedState.DAY_PIC,dayPic);
		outState.putString(O.mapKeys.savedState.NIGHT_PIC,nightPic);
		super.onSaveInstanceState(outState);
		}
	}
