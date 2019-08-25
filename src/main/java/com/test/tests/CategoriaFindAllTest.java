package com.test.tests;

import java.util.List;

import com.test.hibernate.Categoria;

import dao.CategoriaDao;

public class CategoriaFindAllTest {
	public static void main(String[] args) {		
		CategoriaDao catDAO = new CategoriaDao();
		List<Categoria> cats = catDAO.findAll();
		for(Categoria cat: cats) {
			System.out.println("Id: "+cat.getId());
			System.out.println("Descricao: "+cat.getDescricao());
		}
	}
}
