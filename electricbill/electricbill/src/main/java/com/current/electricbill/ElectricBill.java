package com.current.electricbill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectricBill {
	
	@Autowired
	ElectricBillService electricBillService;
  
	@GetMapping
	public String getElectricBill(@RequestParam int serialNumber) {
		double latestbill = 0.0d;
		if(serialNumber != 0) {
			latestbill = electricBillService.getElectricBill(serialNumber);
		}
		if(latestbill == 0.0d) {
			return "There is no due";
		}else if(latestbill == -1.0d) {
			return "something went wrong";
		}
		return "Latest bill is : "+String.valueOf(latestbill);
		
	}
}
