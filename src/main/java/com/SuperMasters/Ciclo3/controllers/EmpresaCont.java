package com.SuperMasters.Ciclo3.controllers;

import com.SuperMasters.Ciclo3.entities.Empresa;
import com.SuperMasters.Ciclo3.services.EmpresaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Controlador para JSON
/*@RestController*/
//Controlador para HTML
@Controller
public class EmpresaCont {

	@Autowired
	EmpresaServ empresaServ;

	//Mostrar todas las empresas en HTML
	@GetMapping({"/", "/empresas"})
	public String viewEmpresas(Model model) {
		List<Empresa> empresas = empresaServ.getAll();
		model.addAttribute("empresas", empresas);
		return "empresas"; //Llamamos al archivo empresas.html en la carpeta templates (resources/templates)
	}

	//Ir a la pagina para crear una empresa
	@GetMapping("/empresas/new")
	public String newEmpresa(Model model) {
		Empresa empresa = new Empresa();
		model.addAttribute("empresa", empresa);
		return "new_empresa";//Llamamos al archivo new_empresa.html en la carpeta templates (resources/templates)
	}

	//Guardar una empresa en la base de datos y volver a la pagina de empresas
	@PostMapping("/empresas/save")
	public String saveEmpresa(Empresa empresa) {
		empresaServ.saveOrUpdate(empresa);
		return "redirect:/empresas";
	}


}
