package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(value = "/{id}")//Para dizer que é do verbo GET e que vamos passar o id - /users/7 por exemplo
	public User findById(@PathVariable Long id) {//Para casar o id da url com o id do parâmetro
		User result = repository.findById(id).get(); //Para pegar o valor do objeto que retorna
		return result;
		
	}
	
	@PostMapping//Para dizer que é do verbo Post
	public User insert(@RequestBody User user) {//Para adicionar um novo usuario que virá no corpo da requisição
		User result = repository.save(user); //Para pegar o valor do objeto que retorna
		return result;
		
	}

}
