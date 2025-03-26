package com.thermal.gasbill;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GasDataImpl {

	@Autowired
	SessionFactory entityManagerFactory;
	
    public GasEntity getGasDetails(int bookingNumber) {
	   GasEntity gasObj = null;

       try {
    	   
    	   Session session = entityManagerFactory.openSession();
           gasObj = session.get(GasEntity.class, bookingNumber);
           session.close();
           entityManagerFactory.close();
           
       } catch (Exception ex) {
           ex.printStackTrace();
       }
	return gasObj;
   }
   
}
