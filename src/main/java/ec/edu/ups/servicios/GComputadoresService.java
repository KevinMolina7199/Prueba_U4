package ec.edu.ups.servicios;

import java.util.List;

import ec.edu.ups.Computadores;
import ec.edu.ups.negocio.GestionComputadores;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;


@Path("computadores")
public class GComputadoresService {
	
	@Inject
	private GestionComputadores gComputadores;

	@GET
	@Path("misDatos")
	@Produces("application/json")
	public Computadores misDatos(){
		Computadores p=new Computadores();
		p.setMarca("HP");
		p.setProcesador("Intel");
		return p;
	}
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response guardarComputadores(Computadores computadores) throws Exception{
		try {
			gComputadores.guardarComputadores(computadores);
			return Response.status(Response.Status.OK).entity(computadores).build();
		} catch (Exception e) {
			e.printStackTrace();
	        Error error = new Error();
	        error.setCodigo(99);
	        error.setMensaje("Error al obtener la lista de computadores: " + e.getMessage());

	        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(error).build();
	    		}
		
	}
	
	@GET
	@Path("listar")
	@Produces("application/json")
	public Response listarComputadores() {
		try {
	        List<Computadores> computadores=gComputadores.listarComputadores();
	        return Response.status(Response.Status.OK).entity(computadores).build();
	    } catch (Exception e) {
	        e.printStackTrace();
	        Error error = new Error();
	        error.setCodigo(99);
	        error.setMensaje("Error al obtener la lista de computadores: " + e.getMessage());

	        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(error).build();
	    }
	}
}
