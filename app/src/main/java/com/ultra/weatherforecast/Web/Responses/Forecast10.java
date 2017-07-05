package com.ultra.weatherforecast.Web.Responses;

import com.google.gson.annotations.Expose;
import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
 * <p></p>
 * <p><sub>(02.07.2017)</sub></p>
 *
 * @author CC-Ultra
 */

public class Forecast10
	{
	@SerializedName("response")
	@Expose
	private Response response;
	@SerializedName("forecast")
	@Expose
	private Forecast forecast;

	private class Avewind
		{
		@SerializedName("mph")
		@Expose
		private Integer mph;
		@SerializedName("kph")
		@Expose
		private Integer kph;
		@SerializedName("dir")
		@Expose
		private String dir;
		@SerializedName("degrees")
		@Expose
		private Integer degrees;

		public Integer getMph()
			{
			return mph;
			}
		public void setMph(Integer mph)
			{
			this.mph = mph;
			}
		public Integer getKph()
			{
			return kph;
			}
		public void setKph(Integer kph)
			{
			this.kph = kph;
			}
		public String getDir()
			{
			return dir;
			}
		public void setDir(String dir)
			{
			this.dir = dir;
			}
		public Integer getDegrees()
			{
			return degrees;
			}
		public void setDegrees(Integer degrees)
			{
			this.degrees = degrees;
			}
		}
	private class Date
		{
		@SerializedName("epoch")
		@Expose
		private String epoch;
		@SerializedName("pretty")
		@Expose
		private String pretty;
		@SerializedName("day")
		@Expose
		private Integer day;
		@SerializedName("month")
		@Expose
		private Integer month;
		@SerializedName("year")
		@Expose
		private Integer year;
		@SerializedName("yday")
		@Expose
		private Integer yday;
		@SerializedName("hour")
		@Expose
		private Integer hour;
		@SerializedName("min")
		@Expose
		private String min;
		@SerializedName("sec")
		@Expose
		private Integer sec;
		@SerializedName("isdst")
		@Expose
		private String isdst;
		@SerializedName("monthname")
		@Expose
		private String monthname;
		@SerializedName("monthname_short")
		@Expose
		private String monthnameShort;
		@SerializedName("weekday_short")
		@Expose
		private String weekdayShort;
		@SerializedName("weekday")
		@Expose
		private String weekday;
		@SerializedName("ampm")
		@Expose
		private String ampm;
		@SerializedName("tz_short")
		@Expose
		private String tzShort;
		@SerializedName("tz_long")
		@Expose
		private String tzLong;

		public String getEpoch()
			{
			return epoch;
			}
		public void setEpoch(String epoch)
			{
			this.epoch = epoch;
			}
		public String getPretty()
			{
			return pretty;
			}
		public void setPretty(String pretty)
			{
			this.pretty = pretty;
			}
		public Integer getDay()
			{
			return day;
			}
		public void setDay(Integer day)
			{
			this.day = day;
			}
		public Integer getMonth()
			{
			return month;
			}
		public void setMonth(Integer month)
			{
			this.month = month;
			}
		public Integer getYear()
			{
			return year;
			}
		public void setYear(Integer year)
			{
			this.year = year;
			}
		public Integer getYday()
			{
			return yday;
			}
		public void setYday(Integer yday)
			{
			this.yday = yday;
			}
		public Integer getHour()
			{
			return hour;
			}
		public void setHour(Integer hour)
			{
			this.hour = hour;
			}
		public String getMin()
			{
			return min;
			}
		public void setMin(String min)
			{
			this.min = min;
			}
		public Integer getSec()
			{
			return sec;
			}
		public void setSec(Integer sec)
			{
			this.sec = sec;
			}
		public String getIsdst()
			{
			return isdst;
			}
		public void setIsdst(String isdst)
			{
			this.isdst = isdst;
			}
		public String getMonthname()
			{
			return monthname;
			}
		public void setMonthname(String monthname)
			{
			this.monthname = monthname;
			}
		public String getMonthnameShort()
			{
			return monthnameShort;
			}
		public void setMonthnameShort(String monthnameShort)
			{
			this.monthnameShort = monthnameShort;
			}
		public String getWeekdayShort()
			{
			return weekdayShort;
			}
		public void setWeekdayShort(String weekdayShort)
			{
			this.weekdayShort = weekdayShort;
			}
		public String getWeekday()
			{
			return weekday;
			}
		public void setWeekday(String weekday)
			{
			this.weekday = weekday;
			}
		public String getAmpm()
			{
			return ampm;
			}
		public void setAmpm(String ampm)
			{
			this.ampm = ampm;
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
		}
	private class Features
		{
		@SerializedName("forecast10day")
		@Expose
		private Integer forecast10day;

		public Integer getForecast10day()
			{
			return forecast10day;
			}
		public void setForecast10day(Integer forecast10day)
			{
			this.forecast10day = forecast10day;
			}
		}
	public class Forecast
		{
		@SerializedName("txt_forecast")
		@Expose
		private TxtForecast txtForecast;
		@SerializedName("simpleforecast")
		@Expose
		private Simpleforecast simpleforecast;

		public TxtForecast getTxtForecast()
			{
			return txtForecast;
			}
		public void setTxtForecast(TxtForecast txtForecast)
			{
			this.txtForecast = txtForecast;
			}
		public Simpleforecast getSimpleforecast()
			{
			return simpleforecast;
			}
		public void setSimpleforecast(Simpleforecast simpleforecast)
			{
			this.simpleforecast = simpleforecast;
			}
		}
	public class Forecastday
		{
		@SerializedName("period")
		@Expose
		private Integer period;
		@SerializedName("icon")
		@Expose
		private String icon;
		@SerializedName("icon_url")
		@Expose
		private String iconUrl;
		@SerializedName("title")
		@Expose
		private String title;
		@SerializedName("fcttext")
		@Expose
		private String fcttext;
		@SerializedName("fcttext_metric")
		@Expose
		private String fcttextMetric;
		@SerializedName("pop")
		@Expose
		private String pop;

		public Integer getPeriod()
			{
			return period;
			}
		public void setPeriod(Integer period)
			{
			this.period = period;
			}
		public String getIcon()
			{
			return icon;
			}
		public void setIcon(String icon)
			{
			this.icon = icon;
			}
		public String getIconUrl()
			{
			return iconUrl;
			}
		public void setIconUrl(String iconUrl)
			{
			this.iconUrl = iconUrl;
			}
		public String getTitle()
			{
			return title;
			}
		public void setTitle(String title)
			{
			this.title = title;
			}
		public String getFcttext()
			{
			return fcttext;
			}
		public void setFcttext(String fcttext)
			{
			this.fcttext = fcttext;
			}
		public String getFcttextMetric()
			{
			return fcttextMetric;
			}
		public void setFcttextMetric(String fcttextMetric)
			{
			this.fcttextMetric = fcttextMetric;
			}
		public String getPop()
			{
			return pop;
			}
		public void setPop(String pop)
			{
			this.pop = pop;
			}
		}
	private class Forecastday_
		{
		@SerializedName("date")
		@Expose
		private Date date;
		@SerializedName("period")
		@Expose
		private Integer period;
		@SerializedName("high")
		@Expose
		private High high;
		@SerializedName("low")
		@Expose
		private Low low;
		@SerializedName("conditions")
		@Expose
		private String conditions;
		@SerializedName("icon")
		@Expose
		private String icon;
		@SerializedName("icon_url")
		@Expose
		private String iconUrl;
		@SerializedName("skyicon")
		@Expose
		private String skyicon;
		@SerializedName("pop")
		@Expose
		private Integer pop;
		@SerializedName("qpf_allday")
		@Expose
		private QpfAllday qpfAllday;
		@SerializedName("qpf_day")
		@Expose
		private QpfDay qpfDay;
		@SerializedName("qpf_night")
		@Expose
		private QpfNight qpfNight;
		@SerializedName("snow_allday")
		@Expose
		private SnowAllday snowAllday;
		@SerializedName("snow_day")
		@Expose
		private SnowDay snowDay;
		@SerializedName("snow_night")
		@Expose
		private SnowNight snowNight;
		@SerializedName("maxwind")
		@Expose
		private Maxwind maxwind;
		@SerializedName("avewind")
		@Expose
		private Avewind avewind;
		@SerializedName("avehumidity")
		@Expose
		private Integer avehumidity;
		@SerializedName("maxhumidity")
		@Expose
		private Integer maxhumidity;
		@SerializedName("minhumidity")
		@Expose
		private Integer minhumidity;

		public Date getDate()
			{
			return date;
			}
		public void setDate(Date date)
			{
			this.date = date;
			}
		public Integer getPeriod()
			{
			return period;
			}
		public void setPeriod(Integer period)
			{
			this.period = period;
			}
		public High getHigh()
			{
			return high;
			}
		public void setHigh(High high)
			{
			this.high = high;
			}
		public Low getLow()
			{
			return low;
			}
		public void setLow(Low low)
			{
			this.low = low;
			}
		public String getConditions()
			{
			return conditions;
			}
		public void setConditions(String conditions)
			{
			this.conditions = conditions;
			}
		public String getIcon()
			{
			return icon;
			}
		public void setIcon(String icon)
			{
			this.icon = icon;
			}
		public String getIconUrl()
			{
			return iconUrl;
			}
		public void setIconUrl(String iconUrl)
			{
			this.iconUrl = iconUrl;
			}
		public String getSkyicon()
			{
			return skyicon;
			}
		public void setSkyicon(String skyicon)
			{
			this.skyicon = skyicon;
			}
		public Integer getPop()
			{
			return pop;
			}
		public void setPop(Integer pop)
			{
			this.pop = pop;
			}
		public QpfAllday getQpfAllday()
			{
			return qpfAllday;
			}
		public void setQpfAllday(QpfAllday qpfAllday)
			{
			this.qpfAllday = qpfAllday;
			}
		public QpfDay getQpfDay()
			{
			return qpfDay;
			}
		public void setQpfDay(QpfDay qpfDay)
			{
			this.qpfDay = qpfDay;
			}
		public QpfNight getQpfNight()
			{
			return qpfNight;
			}
		public void setQpfNight(QpfNight qpfNight)
			{
			this.qpfNight = qpfNight;
			}
		public SnowAllday getSnowAllday()
			{
			return snowAllday;
			}
		public void setSnowAllday(SnowAllday snowAllday)
			{
			this.snowAllday = snowAllday;
			}
		public SnowDay getSnowDay()
			{
			return snowDay;
			}
		public void setSnowDay(SnowDay snowDay)
			{
			this.snowDay = snowDay;
			}
		public SnowNight getSnowNight()
			{
			return snowNight;
			}
		public void setSnowNight(SnowNight snowNight)
			{
			this.snowNight = snowNight;
			}
		public Maxwind getMaxwind()
			{
			return maxwind;
			}
		public void setMaxwind(Maxwind maxwind)
			{
			this.maxwind = maxwind;
			}
		public Avewind getAvewind()
			{
			return avewind;
			}
		public void setAvewind(Avewind avewind)
			{
			this.avewind = avewind;
			}
		public Integer getAvehumidity()
			{
			return avehumidity;
			}
		public void setAvehumidity(Integer avehumidity)
			{
			this.avehumidity = avehumidity;
			}
		public Integer getMaxhumidity()
			{
			return maxhumidity;
			}
		public void setMaxhumidity(Integer maxhumidity)
			{
			this.maxhumidity = maxhumidity;
			}
		public Integer getMinhumidity()
			{
			return minhumidity;
			}
		public void setMinhumidity(Integer minhumidity)
			{
			this.minhumidity = minhumidity;
			}
		}
	private class High
		{
		@SerializedName("fahrenheit")
		@Expose
		private String fahrenheit;
		@SerializedName("celsius")
		@Expose
		private String celsius;

		public String getFahrenheit()
			{
			return fahrenheit;
			}
		public void setFahrenheit(String fahrenheit)
			{
			this.fahrenheit = fahrenheit;
			}
		public String getCelsius()
			{
			return celsius;
			}
		public void setCelsius(String celsius)
			{
			this.celsius = celsius;
			}
		}
	private class Low
		{
		@SerializedName("fahrenheit")
		@Expose
		private String fahrenheit;
		@SerializedName("celsius")
		@Expose
		private String celsius;

		public String getFahrenheit()
			{
			return fahrenheit;
			}
		public void setFahrenheit(String fahrenheit)
			{
			this.fahrenheit = fahrenheit;
			}
		public String getCelsius()
			{
			return celsius;
			}
		public void setCelsius(String celsius)
			{
			this.celsius = celsius;
			}
		}
	private class Maxwind
		{
		@SerializedName("mph")
		@Expose
		private Integer mph;
		@SerializedName("kph")
		@Expose
		private Integer kph;
		@SerializedName("dir")
		@Expose
		private String dir;
		@SerializedName("degrees")
		@Expose
		private Integer degrees;

		public Integer getMph()
			{
			return mph;
			}
		public void setMph(Integer mph)
			{
			this.mph = mph;
			}
		public Integer getKph()
			{
			return kph;
			}
		public void setKph(Integer kph)
			{
			this.kph = kph;
			}
		public String getDir()
			{
			return dir;
			}
		public void setDir(String dir)
			{
			this.dir = dir;
			}
		public Integer getDegrees()
			{
			return degrees;
			}
		public void setDegrees(Integer degrees)
			{
			this.degrees = degrees;
			}
		}
	private class QpfAllday
		{
		@SerializedName("in")
		@Expose
		private Double in;
		@SerializedName("mm")
		@Expose
		private Integer mm;

		public Double getIn()
			{
			return in;
			}
		public void setIn(Double in)
			{
			this.in = in;
			}
		public Integer getMm()
			{
			return mm;
			}
		public void setMm(Integer mm)
			{
			this.mm = mm;
			}
		}
	private class QpfDay
		{
		@SerializedName("in")
		@Expose
		private Double in;
		@SerializedName("mm")
		@Expose
		private Integer mm;

		public Double getIn()
			{
			return in;
			}
		public void setIn(Double in)
			{
			this.in = in;
			}
		public Integer getMm()
			{
			return mm;
			}
		public void setMm(Integer mm)
			{
			this.mm = mm;
			}
		}
	private class QpfNight
		{
		@SerializedName("in")
		@Expose
		private Double in;
		@SerializedName("mm")
		@Expose
		private Integer mm;

		public Double getIn()
			{
			return in;
			}
		public void setIn(Double in)
			{
			this.in = in;
			}
		public Integer getMm()
			{
			return mm;
			}
		public void setMm(Integer mm)
			{
			this.mm = mm;
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
	private class Simpleforecast
		{
		@SerializedName("forecastday")
		@Expose
		private List<Forecastday_> forecastday = null;

		public List<Forecastday_> getForecastday()
			{
			return forecastday;
			}
		public void setForecastday(List<Forecastday_> forecastday)
			{
			this.forecastday = forecastday;
			}
		}
	private class SnowAllday
		{
		@SerializedName("in")
		@Expose
		private Double in;
		@SerializedName("cm")
		@Expose
		private Double cm;

		public Double getIn()
			{
			return in;
			}
		public void setIn(Double in)
			{
			this.in = in;
			}
		public Double getCm()
			{
			return cm;
			}
		public void setCm(Double cm)
			{
			this.cm = cm;
			}
		}
	private class SnowDay
		{
		@SerializedName("in")
		@Expose
		private Double in;
		@SerializedName("cm")
		@Expose
		private Double cm;

		public Double getIn()
			{
			return in;
			}
		public void setIn(Double in)
			{
			this.in = in;
			}
		public Double getCm()
			{
			return cm;
			}
		public void setCm(Double cm)
			{
			this.cm = cm;
			}
		}
	private class SnowNight
		{
		@SerializedName("in")
		@Expose
		private Double in;
		@SerializedName("cm")
		@Expose
		private Double cm;

		public Double getIn()
			{
			return in;
			}
		public void setIn(Double in)
			{
			this.in = in;
			}
		public Double getCm()
			{
			return cm;
			}
		public void setCm(Double cm)
			{
			this.cm = cm;
			}
		}
	public class TxtForecast
		{
		@SerializedName("date")
		@Expose
		private String date;
		@SerializedName("forecastday")
		@Expose
		private List<Forecastday> forecastday = null;

		public String getDate()
			{
			return date;
			}
		public void setDate(String date)
			{
			this.date = date;
			}
		public List<Forecastday> getForecastday()
			{
			return forecastday;
			}
		public void setForecastday(List<Forecastday> forecastday)
			{
			this.forecastday = forecastday;
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
	public void setForecast(Forecast forecast)
		{
		this.forecast = forecast;
		}
	public Forecast getForecast()
		{
		return forecast;
		}
	}









