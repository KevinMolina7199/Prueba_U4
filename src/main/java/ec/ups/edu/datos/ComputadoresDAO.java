package ec.ups.edu.datos;

import java.io.Serializable;
import java.util.List;

import ec.edu.ups.Computadores;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ComputadoresDAO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Computadores computadores) {
		em.persist(computadores);
	}
	
	public void update(Computadores computadores) {
		em.merge(computadores);
	}
	
	public Computadores read(int codigo) {
		Computadores p = em.find(Computadores.class, codigo);
		return p;
	}
	
	public void delete(int codigo) {
		Computadores p = em.find(Computadores.class, codigo);
		em.remove(p);
	}
	
	public List<Computadores> getAll(){
		String jpql = "SELECT c FROM Computadores c";
		Query q = em.createQuery(jpql);
		return q.getResultList();
	}

}
