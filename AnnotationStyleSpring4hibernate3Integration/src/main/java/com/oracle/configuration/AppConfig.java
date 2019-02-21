package com.oracle.configuration;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;

@Import({RepositoryConfig.class})
@Configuration
@ComponentScan("com.oracle")
public class AppConfig {
	@Bean
	public static PropertyPlaceholderConfigurer getProperty()
	{
		PropertyPlaceholderConfigurer configurer=new PropertyPlaceholderConfigurer();
		configurer.setLocation(new ClassPathResource("db.properties"));
		configurer.setIgnoreUnresolvablePlaceholders(true);
		return configurer;
	}

}
