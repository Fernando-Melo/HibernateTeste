package com.test.tests;

import com.test.hibernate.Categoria;

import dao.CategoriaDao;

public class CategoriaDeleteIdTest {
	public static void main(String[] args) {
		CategoriaDao catDAO = new CategoriaDao();
		/*remove category with id 3*/
		Categoria cat = catDAO.remove(3);		
	
	}
	
}
