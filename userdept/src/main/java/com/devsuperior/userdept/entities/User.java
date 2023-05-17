package com.devsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity//Estamos dizendo que será mapeada para uma tabela do bd
@Table(name = "tb_user")//O nome da tabela no banco
public class User {
	
	@Id//Para dizer que é a nossa chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Setando que vai ser de Auto Incremento
	private long id;
	private String name;
	private String email;
	
	//Fazendo o ralacionamento entre usuário e dapartamento
	@ManyToOne//Configurando chave estrangeira - Muitos para Um
	@JoinColumn(name = "department_id")//Configurando o nome da chave estrangeira
	private Department department;
	
	public User() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
