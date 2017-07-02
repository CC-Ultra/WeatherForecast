package com.ultra.weatherforecast.Web;

import com.ultra.weatherforecast.Web.Responses.CityList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * <p></p>
 * <p><sub>(01.07.2017)</sub></p>
 * @author CC-Ultra
 */

public interface ApiAutocomplete
	{
	@GET("aq")
	Call<CityList> getCities(@Query("query")String query);
	}
