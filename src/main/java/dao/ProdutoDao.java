package dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.test.connection.ConnectionFactory;
import com.test.hibernate.Categoria;
import com.test.hibernate.Produto;

public class ProdutoDao {
	public Produto save(Produto produto) {
		EntityManager em = new ConnectionFactory().getConnection();
		try {
			em.getTransaction().begin();
			if(produto.getId() == null) {
				em.persist(produto);
			}else {
				em.merge(produto);
			}
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		return produto;
	}
	public Produto findById(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Produto produto = null;
		try {
			produto = em.find(Produto.class, id);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
		return produto;
	}
	public List<Produto> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Produto> prods = null;
		try {
			prods = em.createQuery("from Produto p").getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
		return prods;
	}	
	
}
