package com.ultra.weatherforecast.Activities;

import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.ultra.weatherforecast.App;
import com.ultra.weatherforecast.Fragments.WeatherPage;
import com.ultra.weatherforecast.R;
import com.ultra.weatherforecast.Units.LatLng;
import com.ultra.weatherforecast.Utils.O;
import com.ultra.weatherforecast.Web.Responses.Forecast10;
import com.ultra.weatherforecast.Web.Responses.Location;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 * <p><sub>(01.07.2017)</sub></p>
 *
 * @author CC-Ultra
 */

public class LocalActivity extends AppCompatActivity
	{
	private ViewPager pager;
	private LatLng coords= new LatLng(0,0);
	private String city;
	private LocationManager locationManager;
	private Bundle initBundles[]= new Bundle[7];
	private Button connectBtn;

	private class ForecastCallback implements Callback<Forecast10>
		{
		@Override
		public void onResponse(Call<Forecast10> call,Response<Forecast10> response)
			{
			getInitBundles(response.body() );
			}
		@Override
		public void onFailure(Call<Forecast10> call,Throwable t)
			{
			Log.e(O.TAG,"onFailure: ",t);
			}
		}
	private class CityCallback implements Callback<Location>
		{
		@Override
		public void onResponse(Call<Location> call,Response<Location> response)
			{
			getCity(response.body() );
			}
		@Override
		public void onFailure(Call<Location> call,Throwable t)
			{
			Log.e(O.TAG,"onFailure: ",t);
			}
		}
	private class XLocationListener implements LocationListener
		{
		boolean firstRequest=true;

		@Override
		public void onLocationChanged(android.location.Location location)
			{
			if(firstRequest)
				{
				coords= new LatLng(location.getLatitude(),location.getLongitude() );
				Log.d(O.TAG,"onLocationChanged: lat="+ coords.lat +"\tlng="+ coords.lng);
				App.getApi().getLocation(O.web.API_KEY,coords.lat,coords.lng).enqueue(new CityCallback() );
				firstRequest=false;
				}
			}
		@Override
		public void onStatusChanged(String provider,int status,Bundle extras) {}
		@Override
		public void onProviderEnabled(String provider) {}
		@Override
		public void onProviderDisabled(String provider) {}
		}
	private class ConnectListener implements View.OnClickListener
		{
		@Override
		public void onClick(View v)
			{
			locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);
			if(!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
				Toast.makeText(LocalActivity.this,"Gps не подключен",Toast.LENGTH_SHORT).show();
			else
				{
				connectBtn.setEnabled(false);
				locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new XLocationListener() );
				}
			}
		}
	private class XPagerAdapter extends FragmentPagerAdapter
		{
		ArrayList<WeatherPage> pages;

		public XPagerAdapter(FragmentManager fm,Bundle[] initBundle)
			{
			super(fm);
			pages=new ArrayList<>();
			for(Bundle bundle : initBundle)
				{
				WeatherPage wp= new WeatherPage();
				wp.init(bundle);
				pages.add(wp);
				}
			}
		@Override
		public Fragment getItem(int position)
			{
			return pages.get(position);
			}
		@Override
		public int getCount()
			{
			return pages.size();
			}
		}

	private void getCity(Location response)
		{
		HashMap<String,Integer> map= new HashMap<>();
		for(Location.Station_ station : response.getLocation().getNearbyWeatherStations().getPws().getStation() )
			{
			String city0= station.getCity();
			if(map.containsKey(city0) )
				map.put(city0,map.get(city0)+1);
			else
				map.put(city0,1);
			}
		int max=0;
		String maxCity="";
		for(Map.Entry<String,Integer> x : map.entrySet())
			{
			if(x.getValue()>max)
				{
				max=x.getValue();
				maxCity=x.getKey();
				}
			}
		city=maxCity;
		App.getApi().get10Forecast(O.web.API_KEY,coords.lat,coords.lng).enqueue(new ForecastCallback() );
		}
	private void getInitBundles(Forecast10 response)
		{
		long dayMillis= 1000*60*60*24;
		Date date;
		boolean day=true;
		int i=0;
		for(Forecast10.Forecastday forecastHalfDay : response.getForecast().getTxtForecast().getForecastday())
			{
			if(day)
				initBundles[i]= new Bundle();
			initBundles[i].putString(O.mapKeys.savedState.CITY,city);
			date= new Date();
			date.setTime(date.getTime() + (dayMillis*i) );
			initBundles[i].putLong(O.mapKeys.savedState.DATE,date.getTime() );
			if(day)
				{
				initBundles[i].putString(O.mapKeys.savedState.DAY_INFO,forecastHalfDay.getFcttextMetric() );
				initBundles[i].putString(O.mapKeys.savedState.DAY_PIC,forecastHalfDay.getIconUrl() );
				}
			else
				{
				initBundles[i].putString(O.mapKeys.savedState.NIGHT_INFO,forecastHalfDay.getFcttextMetric() );
				initBundles[i].putString(O.mapKeys.savedState.NIGHT_PIC,forecastHalfDay.getIconUrl() );
				}
			day=!day;
			if(day)
				i++;
			if(i==7)
				break;
			}
		initAdapter();
		}
	private void initAdapter()
		{
		XPagerAdapter adapter= new XPagerAdapter(getSupportFragmentManager(),initBundles);
		pager.setAdapter(adapter);
		connectBtn.setEnabled(true);
		}

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
		{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.local_layout);

		Intent intent= getIntent();
		coords.lat= intent.getDoubleExtra(O.mapKeys.extra.LAT,0);
		coords.lng= intent.getDoubleExtra(O.mapKeys.extra.LNG,0);
		city= intent.getStringExtra(O.mapKeys.extra.CITY);

		pager= (ViewPager)findViewById(R.id.pager);
		connectBtn= (Button)findViewById(R.id.connectBtn);

		if(city!=null)
			{
			connectBtn.setVisibility(View.GONE);
			App.getApi().get10Forecast(O.web.API_KEY,coords.lat,coords.lng).enqueue(new ForecastCallback() );
			}
		connectBtn.setOnClickListener(new ConnectListener() );
		}
	}
