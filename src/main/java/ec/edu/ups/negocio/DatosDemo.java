package ec.edu.ups.negocio;

import ec.edu.ups.Computadores;
import ec.ups.edu.datos.ComputadoresDAO;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class DatosDemo {
	
	@Inject
	private ComputadoresDAO daoComputadores;
	
@PostConstruct
	public void init() {
	System.out.println("Hola UPS");
	
	Computadores c=new Computadores();
	c.setMarca("hp");
	c.setProcesador("Intel");
	daoComputadores.insert(c);
	
	
}
}
