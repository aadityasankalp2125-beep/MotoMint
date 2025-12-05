package com.alpha.MotoMint.Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.alpha.MotoMint.Dto.RegDriverVechileDto;
import com.alpha.MotoMint.Entity.Driver;
import com.alpha.MotoMint.Entity.Vehicle;
import com.alpha.MotoMint.Repository.DriverRepo;

@Service
public class MotoMintService {
	
	@Autowired
	private DriverRepo mr;
	
//	@Value("${locationiq.api.key}")
//	private String locationIqApiKey;

	
	
	

	public Driver  SaveDriverwithVehicle(RegDriverVechileDto rd) {
		Driver driver =new Driver();
		driver.setName(rd.getDriverName());
		
		driver.setName(rd.getDriverName());
        driver.setLicenceno(rd.getLicenceNo());
        driver.setUpiid(rd.getUpiId());
        driver.setAge(rd.getAge());
        driver.setMobileno(rd.getMobileNo());
        driver.setGender(rd.getGender());
        driver.setMail(rd.getMail());
        driver.setStatus("AVAILABLE");

        // 2. Build Vehicle from DTO
        Vehicle vehicle = new Vehicle();

        mr.save(driver);
        vehicle.setId(mr.findByMobileno(driver.getMobileno()).getId());
        vehicle.setName(rd.getVehicleName());
        vehicle.setVehicleno(rd.getVehicleNo());
        vehicle.setType(rd.getType());
        vehicle.setModel(rd.getModel());
        vehicle.setCapacity(rd.getCapacity());
        vehicle.setAvaliability_status("AVAILABLE");
        vehicle.setPricePerKm(rd.getPricePerKm());
        String city=getLocation(rd.getLatitude(),rd.getLongitude());

        vehicle.setCurrent_city(city);
        
        
        vehicle.setDriver(driver);
        driver.setVehicle(vehicle);
        
        
        
        
//        String city = resolveCityFromLatLon(rd.getLatitude(), rd.getLongitude());
//        vehicle.setCurrent_city(city);
//        
        mr.save(driver);
        return driver;
		
	}

	private final RestTemplate restTemplate = new RestTemplate();
	private final String apikey = "pk.e9fe6dcaeb7648414ba95f64571d86ab";
	
public String getLocation(double latitude, double longitude) {

	 RestTemplate template = new RestTemplate();
		String url = UriComponentsBuilder.fromUriString("https://us1.locationiq.com/v1/reverse")
				.queryParam("key", apikey).queryParam("lat", latitude).queryParam("lon", longitude)
				.queryParam("format", "json").build().toUriString();


		System.err.println(url);
		
		try {
		    Map<String, Object> response = template.getForObject(url, Map.class);
		    System.out.println(response);
		    Map<String, Object> address = (Map<String, Object>) response.get("address");

		   //  Full fallback order
		    String[] keys = {
		        "city", 
		        "town", 
		        "village", 
		        "municipality",
		        "county",
		        "state_district",
		        "suburb"
		    };

		    for (String key : keys) {
		        if (address.get(key) != null) {
		            return address.get(key).toString();
		        }
		    }
//			
		} catch (Exception ex) {
		    System.out.println("ERROR: " + ex.getMessage());
		}

			

		return "Unkown";
	}
	
	

}
