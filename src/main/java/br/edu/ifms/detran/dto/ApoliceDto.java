package br.edu.ifms.detran.dto;

import br.edu.ifms.detran.model.Apolice;

public class ApoliceDto {
	
	private Long id;
	private float valor;
	private  String cobertura; 
	private  String vigencia;
	
	
	public ApoliceDto() {
		//construtor vazio
	}


	public ApoliceDto(Apolice apolice) {
		super();
		this.id = apolice.getId();
		this.valor = apolice.getValor();
		this.cobertura = apolice.getCobertura();
		this.vigencia = apolice.getCobertura();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public String getCobertura() {
		return cobertura;
	}


	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}


	public String getVigencia() {
		return vigencia;
	}


	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}
	
	
	
	
	
	
	
	

}
