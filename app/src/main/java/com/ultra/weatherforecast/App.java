package com.ultra.weatherforecast;

import android.app.Application;
import com.ultra.weatherforecast.Utils.O;
import com.ultra.weatherforecast.Web.Api;
import com.ultra.weatherforecast.Web.ApiAutocomplete;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * <p></p>
 * <p><sub>(01.07.2017)</sub></p>
 *
 * @author CC-Ultra
 */

public class App extends Application
	{
	private static Api api;
	private static ApiAutocomplete autocompleteApi;

	public static Api getApi()
		{
		return api;
		}
	public static ApiAutocomplete getAutocompleteApi()
		{
		return autocompleteApi;
		}

	@Override
	public void onCreate()
		{
		super.onCreate();
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(O.web.BASE_URL +"/")
				.addConverterFactory(GsonConverterFactory.create() )
				.build();
		api= retrofit.create(Api.class);
		retrofit = new Retrofit.Builder()
				.baseUrl(O.web.BASE_AUTOCOMPLETE_URL +"/")
				.addConverterFactory(GsonConverterFactory.create() )
				.build();
		autocompleteApi= retrofit.create(ApiAutocomplete.class);
		}
	}
