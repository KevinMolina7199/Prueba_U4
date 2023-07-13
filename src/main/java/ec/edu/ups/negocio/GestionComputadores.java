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
		if(daoComputadores.read(computadores.getId_computadores()) == null) {
			try {
				daoComputadores.insert(computadores);
			}catch(Exception e) {
				throw new Exception("Error al insertar: " + e.getMessage());
			}
		}else {
			try {
				daoComputadores.update(computadores);
			}catch(Exception e) {
				throw new Exception("Error al actualizar: " + e.getMessage());
			}
		}
	}
	
	public void guardarComputadores(int id_computadores, String marca, String procesador, String RAM, String DiscoDuro, String TarjetaGrafica) {
		
	}
	
	public List<Computadores> listarComputadores() {
		return daoComputadores.getAll();
	}
}
