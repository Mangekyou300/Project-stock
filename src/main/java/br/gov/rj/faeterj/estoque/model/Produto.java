package br.gov.rj.faeterj.estoque.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Produto {
	
	@NotBlank(message = "Erro no campo Code")
	private String code;
	
	@NotBlank(message = "Erro no campo Name")
	private String name;
	
	@Size(min = 1, max = 50, message = "Erro no campo Description. Minimo 1 caracter e maximo 50 caracteres")
	private String description;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
