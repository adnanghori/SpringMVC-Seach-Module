package com.user.registration.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.user.registration.model.User;

@Configuration

public class ConfigurationClass {
	@Bean("datasource") 
	  public AbstractDataSource getDataSouce(){
		  	DriverManagerDataSource dataSource = new DriverManagerDataSource();
		  	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		  	dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/springjdbc");
		  	dataSource.setUsername("root");
		  	dataSource.setPassword("Macbookair03");
		  	return dataSource;
	  }
	@Bean("localSessionFactory")
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(getDataSouce());
		Properties properties  = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty("hibernate.show_sql","true" );
		properties.setProperty("hibernate.hbm2ddl.auto", "create");
		localSessionFactoryBean.setHibernateProperties(properties);
		localSessionFactoryBean.setAnnotatedClasses(User.class);
		return localSessionFactoryBean;
	}
	@Bean("hibernateTemplate")
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate hibernateTemplate =  new HibernateTemplate();
		hibernateTemplate.setSessionFactory(getLocalSessionFactoryBean().getObject());
		return hibernateTemplate;
	}
	@Bean("transactionManager")
	public HibernateTransactionManager getHibernateTransactionManager() {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(getLocalSessionFactoryBean().getObject());
		return hibernateTransactionManager;
	}
}
