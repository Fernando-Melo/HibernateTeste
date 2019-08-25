package dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.test.connection.ConnectionFactory;
import com.test.hibernate.Categoria;

public class CategoriaDao {
	public Categoria save(Categoria cat) {
		EntityManager em = new ConnectionFactory().getConnection();
		try {
			em.getTransaction().begin();
			if(cat.getId()==null) {
				em.persist(cat);
			}else {
				em.merge(cat);
			}
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {	
		em.close();
		}
		return cat;		
	}
	public Categoria findById(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Categoria cat = null;
		try {
			cat = em.find(Categoria.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			em.close();
		}
		return cat;		
	}

	public Categoria remove(Integer id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Categoria cat = null;
		
		try {
			cat = em.find(Categoria.class, id);
			em.getTransaction().begin();
			em.remove(cat);
			em.getTransaction().commit();
		}catch(Exception e){
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		return cat;		
	}
	
	public List<Categoria> findAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Categoria> cats = null;
		try {
			cats = em.createQuery("from Categoria c").getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
		return cats;
	}
}
