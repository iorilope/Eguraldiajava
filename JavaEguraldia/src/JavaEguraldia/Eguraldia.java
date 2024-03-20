/**
 * 
 */
package JavaEguraldia;

/**
 * 
 * @author Ioritz Lopetegi
 */
import com.fasterxml.jackson.databind.ObjectMapper; 
public class Eguraldia {
	 
	// import com.fasterxml.jackson.annotation.JsonProperty; 
	/* ObjectMapper om = new ObjectMapper();
	Root root = om.readValue(myJsonString, Root.class); */
	public class Clouds{
	    @JsonProperty("all") 
	    public int getAll() { 
			 return this.all; } 
	    public void setAll(int all) { 
			 this.all = all; } 
	    int all;
	}

	public class Coord{
	    @JsonProperty("lat") 
	    public double getLat() { 
			 return this.lat; } 
	    public void setLat(double lat) { 
			 this.lat = lat; } 
	    double lat;
	    @JsonProperty("lon") 
	    public double getLon() { 
			 return this.lon; } 
	    public void setLon(double lon) { 
			 this.lon = lon; } 
	    double lon;
	}

	public class List{
	    @JsonProperty("id") 
	    public int getId() { 
			 return this.id; } 
	    public void setId(int id) { 
			 this.id = id; } 
	    int id;
	    @JsonProperty("name") 
	    public String getName() { 
			 return this.name; } 
	    public void setName(String name) { 
			 this.name = name; } 
	    String name;
	    @JsonProperty("coord") 
	    public Coord getCoord() { 
			 return this.coord; } 
	    public void setCoord(Coord coord) { 
			 this.coord = coord; } 
	    Coord coord;
	    @JsonProperty("main") 
	    public Main getMain() { 
			 return this.main; } 
	    public void setMain(Main main) { 
			 this.main = main; } 
	    Main main;
	    @JsonProperty("dt") 
	    public int getDt() { 
			 return this.dt; } 
	    public void setDt(int dt) { 
			 this.dt = dt; } 
	    int dt;
	    @JsonProperty("wind") 
	    public Wind getWind() { 
			 return this.wind; } 
	    public void setWind(Wind wind) { 
			 this.wind = wind; } 
	    Wind wind;
	    @JsonProperty("sys") 
	    public Sys getSys() { 
			 return this.sys; } 
	    public void setSys(Sys sys) { 
			 this.sys = sys; } 
	    Sys sys;
	    @JsonProperty("rain") 
	    public Object getRain() { 
			 return this.rain; } 
	    public void setRain(Object rain) { 
			 this.rain = rain; } 
	    Object rain;
	    @JsonProperty("snow") 
	    public Object getSnow() { 
			 return this.snow; } 
	    public void setSnow(Object snow) { 
			 this.snow = snow; } 
	    Object snow;
	    @JsonProperty("clouds") 
	    public Clouds getClouds() { 
			 return this.clouds; } 
	    public void setClouds(Clouds clouds) { 
			 this.clouds = clouds; } 
	    Clouds clouds;
	    @JsonProperty("weather") 
	    public ArrayList<Weather> getWeather() { 
			 return this.weather; } 
	    public void setWeather(ArrayList<Weather> weather) { 
			 this.weather = weather; } 
	    ArrayList<Weather> weather;
	}

	public class Main{
	    @JsonProperty("temp") 
	    public double getTemp() { 
			 return this.temp; } 
	    public void setTemp(double temp) { 
			 this.temp = temp; } 
	    double temp;
	    @JsonProperty("feels_like") 
	    public double getFeels_like() { 
			 return this.feels_like; } 
	    public void setFeels_like(double feels_like) { 
			 this.feels_like = feels_like; } 
	    double feels_like;
	    @JsonProperty("temp_min") 
	    public double getTemp_min() { 
			 return this.temp_min; } 
	    public void setTemp_min(double temp_min) { 
			 this.temp_min = temp_min; } 
	    double temp_min;
	    @JsonProperty("temp_max") 
	    public double getTemp_max() { 
			 return this.temp_max; } 
	    public void setTemp_max(double temp_max) { 
			 this.temp_max = temp_max; } 
	    double temp_max;
	    @JsonProperty("pressure") 
	    public int getPressure() { 
			 return this.pressure; } 
	    public void setPressure(int pressure) { 
			 this.pressure = pressure; } 
	    int pressure;
	    @JsonProperty("humidity") 
	    public int getHumidity() { 
			 return this.humidity; } 
	    public void setHumidity(int humidity) { 
			 this.humidity = humidity; } 
	    int humidity;
	}

	public class Root{
	    @JsonProperty("message") 
	    public String getMessage() { 
			 return this.message; } 
	    public void setMessage(String message) { 
			 this.message = message; } 
	    String message;
	    @JsonProperty("cod") 
	    public String getCod() { 
			 return this.cod; } 
	    public void setCod(String cod) { 
			 this.cod = cod; } 
	    String cod;
	    @JsonProperty("count") 
	    public int getCount() { 
			 return this.count; } 
	    public void setCount(int count) { 
			 this.count = count; } 
	    int count;
	    @JsonProperty("list") 
	    public ArrayList<List> getList() { 
			 return this.list; } 
	    public void setList(ArrayList<List> list) { 
			 this.list = list; } 
	    ArrayList<List> list;
	}

	public class Sys{
	    @JsonProperty("country") 
	    public String getCountry() { 
			 return this.country; } 
	    public void setCountry(String country) { 
			 this.country = country; } 
	    String country;
	}

	public class Weather{
	    @JsonProperty("id") 
	    public int getId() { 
			 return this.id; } 
	    public void setId(int id) { 
			 this.id = id; } 
	    int id;
	    @JsonProperty("main") 
	    public String getMain() { 
			 return this.main; } 
	    public void setMain(String main) { 
			 this.main = main; } 
	    String main;
	    @JsonProperty("description") 
	    public String getDescription() { 
			 return this.description; } 
	    public void setDescription(String description) { 
			 this.description = description; } 
	    String description;
	    @JsonProperty("icon") 
	    public String getIcon() { 
			 return this.icon; } 
	    public void setIcon(String icon) { 
			 this.icon = icon; } 
	    String icon;
	}

	public class Wind{
	    @JsonProperty("speed") 
	    public double getSpeed() { 
			 return this.speed; } 
	    public void setSpeed(double speed) { 
			 this.speed = speed; } 
	    double speed;
	    @JsonProperty("deg") 
	    public int getDeg() { 
			 return this.deg; } 
	    public void setDeg(int deg) { 
			 this.deg = deg; } 
	    int deg;
	}



}
