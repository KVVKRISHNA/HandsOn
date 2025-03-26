package com.thermal.gasbill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gas")
public class GasBill {
	
	@Autowired
	GasBillService gasBillService;
  
	@GetMapping("/getGasBill")
	public String getGasBill(@RequestParam int consumerNumber) {
		double latestbill = 0.0d;
		if(consumerNumber != 0) {
			latestbill = gasBillService.getGasBill(consumerNumber);
		}
		if(latestbill == 0.0d) {
			return "There is no due";
		}else if(latestbill == -1.0d) {
			return "something went wrong";
		}
		return "Latest bill is : "+String.valueOf(latestbill);
		
	}
}
