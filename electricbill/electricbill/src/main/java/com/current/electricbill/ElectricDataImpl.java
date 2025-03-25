package com.current.electricbill;

import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;

public class ElectricDataImpl {

   public ElectricEntity getElectricDetails(int serviceNumber) {
	   ElectricEntity electricObj = new ElectricEntity();
	   electricObj.setSerialNumber(serviceNumber);
	   
	   final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
               .configure() // configures settings from hibernate.cfg.xml
               .build();
       try {
    	   
           SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
           Session session = factory.openSession();
           //Transaction transaction = session.beginTransaction();
            
           //Customer customer = new Customer("Alexander", "alexander@gmail.com");
           
           //session.save(customer);
            
           //transaction.commit();
           electricObj = session.getReference(ElectricEntity.class, electricObj);
            
           session.close();
           factory.close();
           
           
       } catch (Exception ex) {
           StandardServiceRegistryBuilder.destroy(registry);
       }
	return electricObj;
   }
	
	
}
