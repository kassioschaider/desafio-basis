package br.com.kassioschaider.desafio.basis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class BasisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasisApplication.class, args);
	}

//	@Bean
//	public DataSource dataSource(){
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://0.0.0.0:3306/trabalho");
//		dataSource.setUsername("kassio");
//		dataSource.setPassword("root");
//		return dataSource;
//	}


}
