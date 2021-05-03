package org.generation.FarmaGen.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Categoria {

	
	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(max = 20)
	private String departamento;

	private String higiene;

	private String saude;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getHigiene() {
		return higiene;
	}

	public void setHigiene(String higiene) {
		this.higiene = higiene;
	}

	public String getSaude() {
		return saude;
	}

	public void setSaude(String saude) {
		this.saude = saude;
	}

	
}
