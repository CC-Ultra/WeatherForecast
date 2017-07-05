package com.ultra.weatherforecast.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.*;
import com.ultra.weatherforecast.App;
import com.ultra.weatherforecast.R;
import com.ultra.weatherforecast.Units.LatLng;
import com.ultra.weatherforecast.Utils.O;
import com.ultra.weatherforecast.Web.Responses.CityList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * <p></p>
 * <p><sub>(01.07.2017)</sub></p>
 *
 * @author CC-Ultra
 */

public class SearchActivity extends AppCompatActivity
	{
	private ArrayAdapter<String> adapter;
	private HashMap<String,LatLng> map= new HashMap<>();

	private class CitiesCallback implements Callback<CityList>
		{
		@Override
		public void onResponse(Call<CityList> call,Response<CityList> response)
			{
			map.clear();
			if(response.body()!=null)
				{
				for(CityList.RESULT result : response.body().getRESULTS() )
					if(result!=null && result.getLat()!=null && result.getLon()!=null)
						{
						LatLng latLng=new LatLng(Double.parseDouble(result.getLat() ),Double.parseDouble(result.getLon() ) );
						map.put(result.getName(),latLng);
						}
				adapter.clear();
				adapter.addAll(map.keySet() );
				}
			}
		@Override
		public void onFailure(Call<CityList> call,Throwable t)
			{
			Log.e(O.TAG,"onFailure: ",t);
			}
		}
	private class InputListener implements TextWatcher
		{
		@Override
		public void beforeTextChanged(CharSequence s,int start,int count,int after) {}
		@Override
		public void onTextChanged(CharSequence s,int start,int before,int count) {}
		@Override
		public void afterTextChanged(Editable s)
			{
			String str= s.toString();
			App.getAutocompleteApi().getCities(str).enqueue(new CitiesCallback() );
			}
		}
	private class ListClickListener implements AdapterView.OnItemClickListener
		{
		@Override
		public void onItemClick(AdapterView<?> parent,View view,int position,long id)
			{
			Intent jumper= new Intent(SearchActivity.this,LocalActivity.class);
			String city= adapter.getItem(position);
			jumper.putExtra(O.mapKeys.extra.LAT,map.get(city).lat);
			jumper.putExtra(O.mapKeys.extra.LNG,map.get(city).lng);
			jumper.putExtra(O.mapKeys.extra.CITY,city.substring(0,city.indexOf(",") ) );
			Log.d(O.TAG,"onItemClick: "+ map.get(city).lat);
			Log.d(O.TAG,"onItemClick: "+ map.get(city).lng);
			Log.d(O.TAG,"onItemClick: "+city.substring(0,city.indexOf(",") ) );
			startActivity(jumper);
			}
		}

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
		{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_layout);

		EditText inputCity= (EditText)findViewById(R.id.inputCity);
		ListView listResults= (ListView)findViewById(R.id.list);

		adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,new ArrayList<String>() );
		listResults.setOnItemClickListener(new ListClickListener() );
		listResults.setAdapter(adapter);
		inputCity.addTextChangedListener(new InputListener() );
		}
	}
