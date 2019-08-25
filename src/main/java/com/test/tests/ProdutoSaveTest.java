package com.test.tests;

import com.test.hibernate.Categoria;
import com.test.hibernate.Produto;

import dao.CategoriaDao;
import dao.ProdutoDao;

public class ProdutoSaveTest {
	 public static void main(String[] args) {
		 CategoriaDao categoriaDao = new CategoriaDao();
		 ProdutoDao produtoDao = new ProdutoDao(); 
		
		Categoria categoria = new Categoria();
		categoria.setDescricao("Bebidas");
		
		categoria = categoriaDao.save(categoria);
		
		Produto produto = new Produto();
		produto.setDescricao("Água");
		produto.setQtd(25);
		produto.setValor(4.5);
		produto.setCategoria(categoria);
		
		produtoDao.save(produto);
	}
}
