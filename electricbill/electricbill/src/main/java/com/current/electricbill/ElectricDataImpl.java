package com.current.electricbill;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ElectricDataImpl {

	@Autowired
	SessionFactory entityManagerFactory;
	
    public ElectricEntity getElectricDetails(int serviceNumber) {
	   ElectricEntity electricObj = null;

       try {
    	   
    	   Session session = entityManagerFactory.openSession();
           electricObj = session.get(ElectricEntity.class, serviceNumber);
           session.close();
           entityManagerFactory.close();
           
       } catch (Exception ex) {
           ex.printStackTrace();
       }
	return electricObj;
   }
   
}
