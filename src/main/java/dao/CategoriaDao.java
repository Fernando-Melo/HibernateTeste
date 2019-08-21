package dao;

import javax.persistence.EntityManager;

import com.test.connection.ConnectionFactory;
import com.test.hibernate.Categoria;

public class CategoriaDao {
	public Categoria save(Categoria cat) {
		EntityManager em = new ConnectionFactory().getConnection();
		try {
			em.getTransaction().begin();
			em.persist(cat);
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {	
		em.close();
		}
		return cat;		
	}
}
