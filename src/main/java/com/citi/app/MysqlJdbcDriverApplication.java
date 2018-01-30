package com.citi.app;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
import com.citi.rep.SystemRepository;
 
@SpringBootApplication
@EnableJpaRepositories("com.citi.rep")
@EntityScan("com.citi.model")
public class MysqlJdbcDriverApplication implements CommandLineRunner {
 
    @Autowired
    DataSource dataSource;
 
    @Autowired
    SystemRepository systemRepository;
 
    public static void main(String[] args) {
        SpringApplication.run(MysqlJdbcDriverApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Our DataSource is = " + dataSource);
        Iterable<com.citi.model.System> systemlist = systemRepository.findAll();
        for(com.citi.model.System systemmodel:systemlist){
            System.out.println("Here is a system: " + systemmodel.toString());
        }
         
 
    }
 
}
