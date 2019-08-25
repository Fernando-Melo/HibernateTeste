package com.test.tests;

import com.test.hibernate.Produto;

import dao.ProdutoDao;

public class ProdutoFindByIdTest {
	public static void main(String[] args) {
		ProdutoDao produtoDao = new ProdutoDao();
		Produto prod = produtoDao.findById(2);
		System.out.println("id: " + prod.getId());
		System.out.println("descrição: " +prod.getDescricao());
		System.out.println("quantidade: " +prod.getQtd());
		System.out.println("valor: " +prod.getValor());
		System.out.println("id da categoria: " + prod.getCategoria().getId());
		System.out.println("descrição da categoria: " + prod.getCategoria().getDescricao());
	}
}