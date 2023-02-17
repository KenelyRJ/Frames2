package br.edu.ifms.detran.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Infracao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private int pontos;
	private float valor;
	@OneToMany(mappedBy = "infracao")
	private List <Multa> multas = new ArrayList<Multa>();
	
	public Infracao() {
		
	}
	

	public Infracao(Long id, String descricao, int pontos, float valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.pontos = pontos;
		this.valor = valor;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}


	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, pontos, valor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infracao other = (Infracao) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id) && pontos == other.pontos
				&& Float.floatToIntBits(valor) == Float.floatToIntBits(other.valor);
	}
	
	

}
