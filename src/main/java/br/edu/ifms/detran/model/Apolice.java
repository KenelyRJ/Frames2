package br.edu.ifms.detran.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
@Entity
public class Apolice implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id	
	private Integer id;
	private float valor;
	private  String cobertura; 
	private  String vigencia;
	@OneToOne
	@JoinColumn(name="carro_id")
	@MapsId
	private Carro carro;
	
	
	public Apolice(){
		//construtor vazio
	}


	public Apolice(Integer id, float valor, String cobertura, String vigencia, Carro carro) {
		super();
		this.id = id;
		this.valor = valor;
		this.cobertura = cobertura;
		this.vigencia = vigencia;
		this.carro = carro;
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
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


	public Carro getCarro() {
		return carro;
	}


	public void setCarro(Carro carro) {
		this.carro = carro;
	}


	@Override
	public int hashCode() {
		return Objects.hash(carro, cobertura, id, valor, vigencia);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apolice other = (Apolice) obj;
		return Objects.equals(carro, other.carro) && Objects.equals(cobertura, other.cobertura)
				&& Objects.equals(id, other.id) && Float.floatToIntBits(valor) == Float.floatToIntBits(other.valor)
				&& Objects.equals(vigencia, other.vigencia);
	}
	
}
