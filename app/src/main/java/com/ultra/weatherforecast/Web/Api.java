package com.ultra.weatherforecast.Web;

import com.ultra.weatherforecast.Web.Responses.Forecast10;
import com.ultra.weatherforecast.Web.Responses.Location;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * <p></p>
 * <p><sub>(01.07.2017)</sub></p>
 * @author CC-Ultra
 */

public interface Api
	{
	@GET("api/{key}/geolookup/q/{lat},{lng}.json")
	Call<Location> getLocation(@Path("key")String apikey,@Path("lat")float lat,@Path("lng")float lng);

	@GET("api/{key}/forecast10day/lang:RU/q/{lat},{lng}.json")
	Call<Forecast10> get10Forecast(@Path("key")String apikey,@Path("lat")float lat,@Path("lng")float lng);
	}
