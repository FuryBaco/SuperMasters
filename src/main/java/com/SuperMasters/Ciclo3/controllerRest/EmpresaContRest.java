package com.SuperMasters.Ciclo3.controllerRest;


import com.SuperMasters.Ciclo3.entities.Empresa;
import com.SuperMasters.Ciclo3.services.EmpresaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpresaContRest {

	@Autowired
	EmpresaServ empresaServ;

	//Obener todas las empresas
	@GetMapping("/getempr")
	public List<Empresa> viewEmpresas() {
		return empresaServ.getAll();
	}

	//Crear una nueva empresa
	@PostMapping("/postempr")
	public Empresa newEmpresa(@RequestBody Empresa empresa) {
		empresaServ.saveOrUpdate(empresa);
		return empresa;
	}

}
