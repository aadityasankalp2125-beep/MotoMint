package com.alpha.MotoMint.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	private int id;
	private String name;
	private int vehicleno;
	private String type;
	private String model;
	private int capacity;
	private String current_city;
	private String avaliability_status;
	private int PricePerKm;

	@OneToOne
	@JsonIgnore
	private Driver driver;

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", vehicleno=" + vehicleno + ", type=" + type + ", model="
				+ model + ", capacity=" + capacity + ", current_city=" + current_city + ", avaliability_status="
				+ avaliability_status + ", PricePerKm=" + PricePerKm + ", driver=" + driver + "]";
	}

	public Vehicle(int id, String name, int vehicleno, String type, String model, int capacity, String current_city,
			String avaliability_status, int pricePerKm, Driver driver) {
		this.id = id;
		this.name = name;
		this.vehicleno = vehicleno;
		this.type = type;
		this.model = model;
		this.capacity = capacity;
		this.current_city = current_city;
		this.avaliability_status = avaliability_status;
		PricePerKm = pricePerKm;
		this.driver = driver;
	}

	public Vehicle() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVehicleno() {
		return vehicleno;
	}

	public void setVehicleno(int vehicleno) {
		this.vehicleno = vehicleno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCurrent_city() {
		return current_city;
	}

	public void setCurrent_city(String current_city) {
		this.current_city = current_city;
	}

	public String getAvaliability_status() {
		return avaliability_status;
	}

	public void setAvaliability_status(String avaliability_status) {
		this.avaliability_status = avaliability_status;
	}

	public int getPricePerKm() {
		return PricePerKm;
	}

	public void setPricePerKm(int pricePerKm) {
		PricePerKm = pricePerKm;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
