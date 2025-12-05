package com.alpha.MotoMint.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.MotoMint.Dto.RegDriverVechileDto;
import com.alpha.MotoMint.Entity.Driver;
import com.alpha.MotoMint.Entity.Vehicle;
import com.alpha.MotoMint.Service.MotoMintService;

@RestController
public class MotoMintController {
	@Autowired
	private MotoMintService mms;
	
	@PostMapping("/savedetails")
	public Driver saveDetails(@RequestBody RegDriverVechileDto rd) {
		return mms.SaveDriverwithVehicle(rd);
	}
	
	
	
	

}
