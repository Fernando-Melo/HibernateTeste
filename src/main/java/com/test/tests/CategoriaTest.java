package com.test.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.connection.ConnectionFactory;
import com.test.hibernate.Categoria;

import dao.CategoriaDao;

public class CategoriaTest {
	public static void main(String[] args) {
		Categoria cat1 = new Categoria();
		cat1.setDescricao("Nome Categoria 1");
		Categoria cat2 = new Categoria();
		cat2.setDescricao("Nome Categoria 2");
		Categoria cat3= new Categoria();
		cat3.setDescricao("Update using JPA na categoria 3");
		cat3.setId(3);
		
		CategoriaDao catDAO = new CategoriaDao();
		
		cat1 = catDAO.save(cat1);
		cat2 = catDAO.save(cat2);
		cat3 = catDAO.save(cat3);
		
		System.out.println("Categoria 1 ID: " + cat1.getId());
		System.out.println("Categoria 1 Descrição: " + cat1.getDescricao());
		System.out.println("Categoria 2 ID: " + cat2.getId());
		System.out.println("Categoria 2 Descrição: " + cat2.getDescricao());	
		System.out.println("Categoria 3 ID: " + cat3.getId());
		System.out.println("Categoria 3 Descrição: " + cat3.getDescricao());					
	}
}
