package com.test.tests;

import java.util.List;

import com.test.hibernate.Produto;

import dao.ProdutoDao;

public class ProdutoFindAllTest {
	public static void main(String[] args) {		
		ProdutoDao prodDAO = new ProdutoDao();
		List<Produto> prods = prodDAO.findAll();
		prods.forEach(prod->{
			System.out.println("id: " + prod.getId());
			System.out.println("descrição: " +prod.getDescricao());
			System.out.println("quantidade: " +prod.getQtd());
			System.out.println("valor: " +prod.getValor());
			System.out.println("id da categoria: " + prod.getCategoria().getId());
			System.out.println("descrição da categoria: " + prod.getCategoria().getDescricao());
		});
	}
}
