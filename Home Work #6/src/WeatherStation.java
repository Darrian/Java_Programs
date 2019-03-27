
public  class WeatherStation implements Comparable<WeatherStation>{
	private String state;
	private String place;
	private String stationCode;
	private String latitude;
	private String longitude;
	private int elevationInFeet;
	private String country;
	static boolean sortByPlace;

	
	
	
	
	
	








	public WeatherStation(String state, String place, String stationCode, String latitude, String longitude,
			int elevationInFeet, String country) {
		super();
		this.state = state;
		this.place = place;
		this.stationCode = stationCode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevationInFeet = elevationInFeet;
		this.country = country;
	}







	public String getState() {
		return state;
	}







	public void setState(String state) {
		this.state = state;
	}







	public String getPlace() {
		return place;
	}







	public void setPlace(String place) {
		this.place = place;
	}







	public String getStationCode() {
		return stationCode;
	}







	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}







	public String getLatitude() {
		return latitude;
	}







	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}







	public String getLongitude() {
		return longitude;
	}







	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}







	public int getElevationInFeet() {
		return elevationInFeet;
	}







	public void setElevationInFeet(int elevationInFeet) {
		this.elevationInFeet = elevationInFeet;
	}







	public String getCountry() {
		return country;
	}







	public void setCountry(String country) {
		this.country = country;
	}

	public static void sortByPlace(){
		sortByPlace = true;
	}





	@Override
	public int compareTo(WeatherStation other) {
		int result = -99;
		result = this.country.compareTo(other.country);
		if(result == 0){
			result = this.place.compareTo(other.place);
			if(result == 0){
				result = this.state.compareTo(other.state); 
			}
		}
	
		
		return result;
		
		}
	
	@Override
	public String toString() {
		String result;
		 result = String.format("WeatherStation|| State: %s Place: %s StationCode: %s Latitude: %s Longitude: %s ElevationInFeet: %d Country: %s \n",state,place,stationCode,latitude,longitude,elevationInFeet,country);
		 return result;
	}

}
