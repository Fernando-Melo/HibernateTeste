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
		CategoriaDao catDAO = new CategoriaDao();
		cat1 = catDAO.save(cat1);
		cat2 = catDAO.save(cat2);
		
		System.out.println("Categoria 1 ID: " + cat1.getId());
		System.out.println("Categoria 1 Descri��o: " + cat1.getDescricao());
		System.out.println("Categoria 2 ID: " + cat2.getId());
		System.out.println("Categoria 2 Descri��o: " + cat2.getDescricao());		
			
	}
}
