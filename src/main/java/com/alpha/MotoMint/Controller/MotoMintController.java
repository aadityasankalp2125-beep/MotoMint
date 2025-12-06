package com.alpha.MotoMint.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/finddetails")
	public Driver finddata(@RequestParam long mobileno) {
		return mms.finddriver(mobileno);
	}

	@DeleteMapping("/delete/{mobile}")
    public String deleteDriverByMobile(@PathVariable long mobile) {
        return mms.deleteDriverByMobile(mobile);
    }
	

}
