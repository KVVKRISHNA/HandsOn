package com.current.electricbill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricBillService {
    
	
	@Autowired
	ElectricDataImpl electricDataImpl;
	
	public double getElectricBill(int serialNumber) {
		ElectricEntity electricObj = electricDataImpl.getElectricDetails(serialNumber);
		if(electricObj.getMeterUnits() > electricObj.getBilledUnits()) {
			double bill =  calculateBill(electricObj.getMeterUnits() - electricObj.getBilledUnits());
			return (bill - ((bill * electricObj.getSubsidyPercent())/100));
		}else if (electricObj.getMeterUnits() == electricObj.getBilledUnits()){
			return 0.0d;
		}
		
		return -1.0d;
	}
	
	private double calculateBill(int units) 
	{ 
	 
	    if (units <= 100) 
	    { 
	        return units * 10; 
	    } 
	    else if (units <= 200)
	    { 
	        return (100 * 10) + 
	               (units - 100) * 15; 
	    } 
	    else if (units <= 300)
	    { 
	        return (100 * 10) + 
	               (100 * 15) + 
	               (units - 200) * 20; 
	    } 
	    else if (units > 300)
	    { 
	        return (100 * 10) + 
	               (100 * 15) + 
	               (100 * 20) + 
	               (units - 300) * 25; 
	    } 
	    return 0.0d; 
	} 
}
