package com.oracle.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

@Configuration
public class RepositoryConfig {
@Value("${jdbc.driverClassName}") private  String driverClassName;
@Value("${jdbc.url}") private  String url;
@Value("${jdbc.username}") private  String username;
@Value("${jdbc.password}") private  String password;
@Value("${hibernate.dialect}") private  String dialect;
@Value("${hibernate.show_sql}") private  String hibernateShowSql;
@Value("${hibernate.hbm2ddl.auto}") private  String hibernateHbm2ddlAuto;

@Bean
public DataSource dataSource()
{
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName(driverClassName);
	dataSource.setUrl(url);
	dataSource.setUsername(username);
	dataSource.setPassword(password);
	return dataSource;
}
@Bean
public Properties hibernateProperties()
{
	Properties properties=new Properties();
	properties.put("hibernate.dialect",hibernateHbm2ddlAuto );
	properties.put("hibernate.show_sql", hibernateShowSql);
	properties.put("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
	return properties;
}
@Bean
@Autowired
public AnnotationSessionFactoryBean sessionFactory()
{
	AnnotationSessionFactoryBean factoryBean=new AnnotationSessionFactoryBean();
	factoryBean.setDataSource(dataSource());
	factoryBean.setHibernateProperties(hibernateProperties());
	factoryBean.setPackagesToScan(new String[] {"com.oracle.model"});
	return factoryBean;
}
@Bean
@Autowired
public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory)
{
	HibernateTemplate hibernateTemplate=new HibernateTemplate();
	hibernateTemplate.setSessionFactory(sessionFactory);
	return hibernateTemplate;
}
@Bean
@Autowired
public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory) {
	HibernateTransactionManager manager=new HibernateTransactionManager();
	manager.setSessionFactory(sessionFactory);
	return manager;
}

}
