package com.thermal.gasbill;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class HIbernateConfig {

	@Bean
	public DataSource datasource() {
		return DataSourceBuilder.create()
				.driverClassName("oracle.jdbc.OracleDriver")
				.url("jdbc:oracle:thin:@localHost:1521:orcl")
				.username("system")
				.password("Kvvk@db0000")
				.build();
	}
	
	@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory(@Autowired DataSource datasource) {
		LocalSessionFactoryBean sessionFactory = new  LocalSessionFactoryBean();
		sessionFactory.setDataSource(datasource);
		sessionFactory.getHibernateProperties().put("hibernate.show_sql", "true");
		sessionFactory.setPackagesToScan("com.thermal.gasbill");
		return sessionFactory;
		
	}
}
