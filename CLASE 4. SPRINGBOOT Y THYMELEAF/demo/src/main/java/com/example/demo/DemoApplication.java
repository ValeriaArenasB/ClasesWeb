package com.example.demo;

import java.beans.BeanProperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entidad.User;

@SpringBootApplication
//anotacion = forma de agregar codigo que agregara el framework
/*  @SpringBootApplication  es equivalente a usar 
	@Configuration (crear beans), 
	@EnableAutoConfiguration (activar la autoconfiguración) y 
	@ComponentScan (escanear todo lo que es un servlet y lo instancia)
	los tres juntos)*/


public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean //objeto de java que se va a instanciar en el contenedor de spring (en un contexo global y se puede usar cuando se quiera)
	//inyecccion de dependencias, no hacer nre user en el controller sino que ya llegue creado y en el controller se use
	public User user(){
		return new User("Juan", 
		"juan123", 
		"correo@example.com", 
		20);
	}

	@Bean
	public User user2(){
		return new User("Carka", 
		"carlan123", 
		"correocarla@example.com", 
		30);
	}


}
