package com.test.tests;

import com.test.hibernate.Categoria;

import dao.CategoriaDao;

public class CategoriaFindbyIdTest {
	public static void main(String[] args) {		
		CategoriaDao catDAO = new CategoriaDao();
		Categoria cat = catDAO.findById(3);
		System.out.println("Id: "+cat.getId());
		System.out.println("Descricao: "+cat.getDescricao());
	}
}
