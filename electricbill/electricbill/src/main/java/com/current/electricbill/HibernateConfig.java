package com.current.electricbill;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class HibernateConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName("oracle.jdbc.OracleDriver")
                .url("jdbc:oracle:thin:@localhost:1521:orcl")
                .username("system")
                .password("Kvvk@db0000")
                .build();
    }

    @Bean(name = "entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory(@Autowired DataSource dataSource) {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setPackagesToScan("com.current.electricbill");
        sessionFactory.getHibernateProperties().put("hibernate.show_sql", "true");
        return sessionFactory;
    }
}
