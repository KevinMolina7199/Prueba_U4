package ec.edu.ups;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Computadores {
	
	@Id
	@GeneratedValue
	@Column(name="id_computadores")
	private int id_computadores;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="procesador")
	private String procesador;
	
	@Column(name="RAM")
	private String RAM;
	
	@Column(name="DiscoDuro")
	private String DiscoDuro;

	@Column(name="TarjetaGrafica")
	private String TarjetaGrafica;

	public int getId_computadores() {
		return id_computadores;
	}

	public void setId_computadores(int id_computadores) {
		this.id_computadores = id_computadores;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getDiscoDuro() {
		return DiscoDuro;
	}

	public void setDiscoDuro(String discoDuro) {
		DiscoDuro = discoDuro;
	}

	public String getTarjetaGrafica() {
		return TarjetaGrafica;
	}

	public void setTarjetaGrafica(String tarjetaGrafica) {
		TarjetaGrafica = tarjetaGrafica;
	}

	@Override
	public String toString() {
		return "Computadores [id_computadores=" + id_computadores + ", marca=" + marca + ", procesador=" + procesador
				+ ", RAM=" + RAM + ", DiscoDuro=" + DiscoDuro + ", TarjetaGrafica=" + TarjetaGrafica + "]";
	}
	
	
	
}
