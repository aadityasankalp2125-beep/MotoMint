package com.alpha.MotoMint.Dto;

public class LocationUpdateDto {
	private double latitude;
	private double longitude;
	@Override
	public String toString() {
		return "LocationUpdateDto [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	public LocationUpdateDto() {
		super();
	}
	public LocationUpdateDto(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	

}
