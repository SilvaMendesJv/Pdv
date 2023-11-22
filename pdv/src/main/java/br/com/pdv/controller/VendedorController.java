package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.VendedoresRepository;


@Controller

public class VendedorController {
	@Autowired
	private VendedoresRepository vendedoresRepository;
	
	@GetMapping({"/vendedores"})
	public String home(ModelMap model) {
		model.addAttribute("vendedores", vendedoresRepository.findAll());
		return "vendedores";
	}

}
