package com.ultra.weatherforecast.Web.Responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * <p></p>
 * <p><sub>(01.07.2017)</sub></p>
 *
 * @author CC-Ultra
 */

public class Location
	{
	@SerializedName("response")
	@Expose
	private Response response;
	@SerializedName("location")
	@Expose
	private Location_ location;

	private class Airport
		{
		@SerializedName("station")
		@Expose
		private List<Station> station = null;

		public List<Station> getStation()
			{
			return station;
			}

		public void setStation(List<Station> station)
			{
			this.station = station;
			}
		}
	private class Features
		{
		@SerializedName("geolookup")
		@Expose
		private Integer geolookup;

		public Integer getGeolookup()
			{
			return geolookup;
			}
		public void setGeolookup(Integer geolookup)
			{
			this.geolookup = geolookup;
			}
		}
	public class Location_
		{
		@SerializedName("type")
		@Expose
		private String type;
		@SerializedName("country")
		@Expose
		private String country;
		@SerializedName("country_iso3166")
		@Expose
		private String countryIso3166;
		@SerializedName("country_name")
		@Expose
		private String countryName;
		@SerializedName("state")
		@Expose
		private String state;
		@SerializedName("city")
		@Expose
		private String city;
		@SerializedName("tz_short")
		@Expose
		private String tzShort;
		@SerializedName("tz_long")
		@Expose
		private String tzLong;
		@SerializedName("lat")
		@Expose
		private String lat;
		@SerializedName("lon")
		@Expose
		private String lon;
		@SerializedName("zip")
		@Expose
		private String zip;
		@SerializedName("magic")
		@Expose
		private String magic;
		@SerializedName("wmo")
		@Expose
		private String wmo;
		@SerializedName("l")
		@Expose
		private String l;
		@SerializedName("requesturl")
		@Expose
		private String requesturl;
		@SerializedName("wuiurl")
		@Expose
		private String wuiurl;
		@SerializedName("nearby_weather_stations")
		@Expose
		private NearbyWeatherStations nearbyWeatherStations;

		public String getType()
			{
			return type;
			}
		public void setType(String type)
			{
			this.type = type;
			}
		public String getCountry()
			{
			return country;
			}
		public void setCountry(String country)
			{
			this.country = country;
			}
		public String getCountryIso3166()
			{
			return countryIso3166;
			}
		public void setCountryIso3166(String countryIso3166)
			{
			this.countryIso3166 = countryIso3166;
			}
		public String getCountryName()
			{
			return countryName;
			}
		public void setCountryName(String countryName)
			{
			this.countryName = countryName;
			}
		public String getState()
			{
			return state;
			}
		public void setState(String state)
			{
			this.state = state;
			}
		public String getCity()
			{
			return city;
			}
		public void setCity(String city)
			{
			this.city = city;
			}
		public String getTzShort()
			{
			return tzShort;
			}
		public void setTzShort(String tzShort)
			{
			this.tzShort = tzShort;
			}
		public String getTzLong()
			{
			return tzLong;
			}
		public void setTzLong(String tzLong)
			{
			this.tzLong = tzLong;
			}
		public String getLat()
			{
			return lat;
			}
		public void setLat(String lat)
			{
			this.lat = lat;
			}
		public String getLon()
			{
			return lon;
			}
		public void setLon(String lon)
			{
			this.lon = lon;
			}
		public String getZip()
			{
			return zip;
			}
		public void setZip(String zip)
			{
			this.zip = zip;
			}
		public String getMagic()
			{
			return magic;
			}
		public void setMagic(String magic)
			{
			this.magic = magic;
			}
		public String getWmo()
			{
			return wmo;
			}
		public void setWmo(String wmo)
			{
			this.wmo = wmo;
			}
		public String getL()
			{
			return l;
			}
		public void setL(String l)
			{
			this.l = l;
			}
		public String getRequesturl()
			{
			return requesturl;
			}
		public void setRequesturl(String requesturl)
			{
			this.requesturl = requesturl;
			}
		public String getWuiurl()
			{
			return wuiurl;
			}
		public void setWuiurl(String wuiurl)
			{
			this.wuiurl = wuiurl;
			}
		public NearbyWeatherStations getNearbyWeatherStations()
			{
			return nearbyWeatherStations;
			}
		public void setNearbyWeatherStations(NearbyWeatherStations nearbyWeatherStations)
			{
			this.nearbyWeatherStations = nearbyWeatherStations;
			}
		}
	public class NearbyWeatherStations
		{
		@SerializedName("airport")
		@Expose
		private Airport airport;
		@SerializedName("pws")
		@Expose
		private Pws pws;

		public Airport getAirport()
			{
			return airport;
			}
		public void setAirport(Airport airport)
			{
			this.airport = airport;
			}
		public Pws getPws()
			{
			return pws;
			}
		public void setPws(Pws pws)
			{
			this.pws = pws;
			}
		}
	public class Pws
		{
		@SerializedName("station")
		@Expose
		private List<Station_> station = null;

		public List<Station_> getStation()
			{
			return station;
			}
		public void setStation(List<Station_> station)
			{
			this.station = station;
			}
		}
	private class Response
		{
		@SerializedName("version")
		@Expose
		private String version;
		@SerializedName("termsofService")
		@Expose
		private String termsofService;
		@SerializedName("features")
		@Expose
		private Features features;

		public String getVersion()
			{
			return version;
			}
		public void setVersion(String version)
			{
			this.version = version;
			}
		public String getTermsofService()
			{
			return termsofService;
			}
		public void setTermsofService(String termsofService)
			{
			this.termsofService = termsofService;
			}
		public Features getFeatures()
			{
			return features;
			}
		public void setFeatures(Features features)
			{
			this.features = features;
			}
		}
	public class Station
		{
		@SerializedName("city")
		@Expose
		private String city;
		@SerializedName("state")
		@Expose
		private String state;
		@SerializedName("country")
		@Expose
		private String country;
		@SerializedName("icao")
		@Expose
		private String icao;
		@SerializedName("lat")
		@Expose
		private String lat;
		@SerializedName("lon")
		@Expose
		private String lon;

		public String getCity()
			{
			return city;
			}
		public void setCity(String city)
			{
			this.city = city;
			}
		public String getState()
			{
			return state;
			}
		public void setState(String state)
			{
			this.state = state;
			}
		public String getCountry()
			{
			return country;
			}
		public void setCountry(String country)
			{
			this.country = country;
			}
		public String getIcao()
			{
			return icao;
			}
		public void setIcao(String icao)
			{
			this.icao = icao;
			}
		public String getLat()
			{
			return lat;
			}
		public void setLat(String lat)
			{
			this.lat = lat;
			}
		public String getLon()
			{
			return lon;
			}
		public void setLon(String lon)
			{
			this.lon = lon;
			}
		}
	public class Station_
		{
		@SerializedName("neighborhood")
		@Expose
		private String neighborhood;
		@SerializedName("city")
		@Expose
		private String city;
		@SerializedName("state")
		@Expose
		private String state;
		@SerializedName("country")
		@Expose
		private String country;
		@SerializedName("id")
		@Expose
		private String id;
		@SerializedName("distance_km")
		@Expose
		private Integer distanceKm;
		@SerializedName("distance_mi")
		@Expose
		private Integer distanceMi;

		public String getNeighborhood()
			{
			return neighborhood;
			}
		public void setNeighborhood(String neighborhood)
			{
			this.neighborhood = neighborhood;
			}
		public String getCity()
			{
			return city;
			}
		public void setCity(String city)
			{
			this.city = city;
			}
		public String getState()
			{
			return state;
			}
		public void setState(String state)
			{
			this.state = state;
			}
		public String getCountry()
			{
			return country;
			}
		public void setCountry(String country)
			{
			this.country = country;
			}
		public String getId()
			{
			return id;
			}
		public void setId(String id)
			{
			this.id = id;
			}
		public Integer getDistanceKm()
			{
			return distanceKm;
			}
		public void setDistanceKm(Integer distanceKm)
			{
			this.distanceKm = distanceKm;
			}
		public Integer getDistanceMi()
			{
			return distanceMi;
			}
		public void setDistanceMi(Integer distanceMi)
			{
			this.distanceMi = distanceMi;
			}
		}

	public Response getResponse()
		{
		return response;
		}
	public void setResponse(Response response)
		{
		this.response = response;
		}
	public Location_ getLocation()
		{
		return location;
		}
	public void setLocation(Location_ location)
		{
		this.location = location;
		}
	}













