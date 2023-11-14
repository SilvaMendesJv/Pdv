package br.com.pdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.ProdutosRepository;

@Controller

public class ProdutoController {
	private ProdutosRepository produtoRepository;
	
	@GetMapping({"/produtos"})
	public String home(ModelMap model) {
		model.addAttribute("produtos", produtoRepository.findAll());
		return "produtos";
	}

}
