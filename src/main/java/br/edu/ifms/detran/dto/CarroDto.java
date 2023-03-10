package br.edu.ifms.detran.dto;

import br.edu.ifms.detran.model.Carro;

public class CarroDto {
	
	private Long id;
	private String nome;
	private int placa;
	private String marca;
	private Integer modelo;
	private String cor;
	
	public CarroDto() {
	//construtor vazio
		
	}

	public CarroDto(Carro carro) {
		super();
		this.id = carro.getId();
		this.nome = carro.getMarca();
		this.placa = carro.getPlaca();
		this.marca =carro.getMarca();
		this.modelo = carro.getModelo();
		this.cor = carro.getMarca();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPlaca() {
		return placa;
	}


	public void setPlaca(int placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Integer getModelo() {
		return modelo;
	}


	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	
	
}
