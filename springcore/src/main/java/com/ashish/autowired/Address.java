package com.ashish.autowired;

public class Address {
	String cityName;
	String stateName;
	
	public Address() {
		
	}
	
	
	public Address(String cityName, String stateName) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
	}


	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + "]";
	}

	
}
