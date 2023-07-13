package ec.edu.ups.negocio;

import java.util.List;

import ec.edu.ups.Computadores;
import ec.ups.edu.datos.ComputadoresDAO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionComputadores {

	@Inject
	private ComputadoresDAO daoComputadores;
	
	public void guardarComputadores(Computadores computadores) throws Exception {
		daoComputadores.insert(computadores);
	}
	
	public void guardarComputadores(int id_computadores, String marca, String procesador, String RAM, String DiscoDuro, String TarjetaGrafica) {
		
	}
	
	public List<Computadores> listarComputadores() {
		return daoComputadores.getAll();
	}
}
