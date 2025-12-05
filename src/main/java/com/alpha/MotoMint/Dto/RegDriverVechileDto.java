package com.alpha.MotoMint.Dto;

public class RegDriverVechileDto {

    @Override
	public String toString() {
		return "RegDriverVechileDto [driverName=" + driverName + ", licenceNo=" + licenceNo + ", upiId=" + upiId
				+ ", age=" + age + ", mobileNo=" + mobileNo + ", gender=" + gender + ", mail=" + mail + ", vehicleName="
				+ vehicleName + ", vehicleNo=" + vehicleNo + ", type=" + type + ", model=" + model + ", capacity="
				+ capacity + ", pricePerKm=" + pricePerKm + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	public RegDriverVechileDto() {
		super();
	}

	public RegDriverVechileDto(String driverName, int licenceNo, String upiId, int age, long mobileNo, String gender,
			String mail, String vehicleName, int vehicleNo, String type, String model, int capacity, int pricePerKm,
			double latitude, double longitude) {
		super();
		this.driverName = driverName;
		this.licenceNo = licenceNo;
		this.upiId = upiId;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.mail = mail;
		this.vehicleName = vehicleName;
		this.vehicleNo = vehicleNo;
		this.type = type;
		this.model = model;
		this.capacity = capacity;
		this.pricePerKm = pricePerKm;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	// Driver details
    private String driverName;
    private int licenceNo;
    private String upiId;
    private int age;
    private long mobileNo;
    private String gender;
    private String mail;

    // Vehicle details
    private String vehicleName;
    private int vehicleNo;
    private String type;
    private String model;
    private int capacity;
    private int pricePerKm;

    // Initial location details
    private double latitude;
    private double longitude;

    // getters & setters

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(int licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
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

    public int getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(int pricePerKm) {
        this.pricePerKm = pricePerKm;
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

    public double setLongitude(double longitude) {
    	return longitude;
    }}