package com.SuperMasters.Ciclo3;

import com.SuperMasters.Ciclo3.entities.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class Ciclo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

	@GetMapping("/test")
	public String test() {
		Empresa empresa = new Empresa("CapsuleCorp", "Calle 123", "123456789", "123456789");
		return empresa.getNombre();
	}

}
