package main.java.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medidores")
public class Medidor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String linha;
	
	private String modelo;
	
	private String categoria;
	
	Medidor(){
		
	}
	
	Medidor(String linha, String modelo, String categoria){
		this.linha = linha;
		this.modelo = modelo;
		this.categoria = categoria;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Medidor [id=" + id + ", linha=" + linha + ", modelo=" + modelo + ", categoria=" + categoria + "]";
	}
	
	
	
}
