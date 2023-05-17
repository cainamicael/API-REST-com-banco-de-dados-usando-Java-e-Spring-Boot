package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

@RestController//Para dizer que a classe vai ser um controlador Rest - Para criarmos os endpoints
@RequestMapping(value = "/users")//Nosso caminho
public class UserController {
	
	@Autowired//Injeção de dapendência - Para que já seja instanciado 
	private UserRepository repository;//Para podermos usar nossa interface do crud
	
	@GetMapping//Para dizer que é do verbo GET
	public List<User> findAll() {//Método que vai buscar todos os usuários
		List<User> result = repository.findAll(); //Está fazendo a consulta do banco de dados
		return result;
		
	}

}
