package br.gov.rj.faeterj.estoque.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.gov.rj.faeterj.estoque.model.Produto;

@Controller
public class ProdutosController {

	@RequestMapping("/produtos/novo") // Configurando a URL
	public String novo(Produto produto) {
		return "produto/CadastroProduto"; // Retorno do nome da view
	}
	
	//Método POST
	@RequestMapping(value = "/produtos/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Produto produto, BindingResult result, 
			Model model, RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			return novo(produto);
		}
		
		attributes.addFlashAttribute("mensagem", "Produto salvo com sucesso!");
		System.out.println(">>> Code: " + produto.getCode() + "\n>>> Name: " + produto.getName() 
		+ "\n>>> Description: " + produto.getDescription());
		return "redirect:/produtos/novo";
		
	}
	
}
