package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept.entities.User;

//Aqui temos todas as informações básicas de crud
public interface UserRepository extends JpaRepository<User, Long /*Tipo primitivo do ID do usuário*/>{

}
