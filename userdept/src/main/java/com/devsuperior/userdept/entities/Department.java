package com.devsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity//Estamos dizendo que será mapeada para uma tabela do bd
@Table(name = "tb_department")//O nome da tabela no banco
public class Department {
	
	@Id//Para dizer que é a nossa chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Setando que vai ser de Auto Incremento
	private long id;
	private String name;
	
	public Department() {
		
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
	

}
