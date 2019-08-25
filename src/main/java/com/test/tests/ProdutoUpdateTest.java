package com.test.tests;

import com.test.hibernate.Categoria;
import com.test.hibernate.Produto;

import dao.CategoriaDao;
import dao.ProdutoDao;

public class ProdutoUpdateTest {
	public static void main(String[] args) {
		CategoriaDao categoriaDao = new CategoriaDao();
		ProdutoDao produtoDao = new ProdutoDao(); 
		Categoria categoria = categoriaDao.findById(14);

		Produto produto = new Produto();
		produto.setDescricao("Cenoura");
		produto.setQtd(21);
		produto.setValor(15.5);
		produto.setCategoria(categoria);
		produto.setId(1);
		
		produtoDao.save(produto);
	}
}
