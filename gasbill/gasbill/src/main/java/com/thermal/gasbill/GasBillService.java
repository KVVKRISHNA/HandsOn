package com.thermal.gasbill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GasBillService {
    
	
	@Autowired
	GasDataImpl gasDataImpl;
	
	public double getGasBill(int serialNumber) {
		GasEntity gasObj = gasDataImpl.getGasDetails(serialNumber);
		if(gasObj.getBookedCylinders() > 0) {
			return  calculateBill(gasObj);
		}else if (gasObj.getBookedCylinders() == 0){
			return 0.0d;
		}
		
		return -1.0d;
	}
	
	private double calculateBill(GasEntity gasObj) 
	{ 
	    if (gasObj.getConsumedCylinders() >= 10) 
	    { 
	        return gasObj.getBookedCylinders() * 1000;
	    } 
	    else 
	    { 
	        return (gasObj.getBookedCylinders() * 1000) - 
	        		(gasObj.getBookedCylinders() * gasObj.getSubsidyPercent() * 10); 
	    } 
	} 
}
