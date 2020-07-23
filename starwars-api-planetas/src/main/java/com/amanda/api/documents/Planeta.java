package com.amanda.api.documents;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Planeta {

	@Id
	private String id;
	private String nome;
	private String clima;
	private float  terreno;
	private int qtdFilmes;
	
	public Planeta() {
		
	}

	public Planeta(String id, String nome, String clima, float terreno, int qtdFilmes) {
		super();
		this.id = id;
		this.nome = nome;
		this.clima = clima;
		this.terreno = terreno;
		this.qtdFilmes = qtdFilmes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@NotEmpty (message = "O preenchimento do nome é obrigatório!")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@NotEmpty (message = "O preenchimento do clima é obrigatório!")
	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}
	
	
	public float getTerreno() {
		return terreno;
	}

	public void setTerreno(float terreno) {
		this.terreno = terreno;
	}
	
	public int getQtdFilmes() {
		return qtdFilmes;
	}

	public void setQtdFilmes(int qtdFilmes) {
		this.qtdFilmes = qtdFilmes;
	}
	
	
}
