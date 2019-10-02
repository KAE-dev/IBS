package com.web.config;

import com.web.dao.UserDao;
import com.web.dao.UserDaoImpl;
import com.web.service.UserService;
import com.web.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan (basePackages = {"com.web.service", "com.web.dao"})
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTamplate(){
        return new JdbcTemplate(getDataSource());
    }
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/IBS?useSll=false");
        dataSource.setUsername("root");
        dataSource.setPassword("1212");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

}
