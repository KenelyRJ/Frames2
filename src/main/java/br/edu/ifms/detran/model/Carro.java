package br.edu.ifms.detran.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Carro implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String marca;
	private Integer modelo;
	private int placa;
	private String cor;
	@OneToOne(cascade = CascadeType.ALL, mappedBy=  "carro")
	private Apolice apolice;
	
	@OneToMany(mappedBy = "carro")
	private List <Multa> multas = new ArrayList<Multa>();
	
	public Carro() {
		
	}

	

	public Carro(Integer id, String nome, String marca, Integer modelo, int placa, String cor, Apolice apolice) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.apolice = apolice;
	}



public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
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



	public int getPlaca() {
		return placa;
	}



	public void setPlaca(int placa) {
		this.placa = placa;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public Apolice getApolice() {
		return apolice;
	}



	public void setApolice(Apolice apolice) {
		this.apolice = apolice;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Carro other = (Carro) obj;
	return Objects.equals(id, other.id);
}


	

}
