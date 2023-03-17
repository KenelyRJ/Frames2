package br.edu.ifms.detran.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.detran.model.Apolice;
import br.edu.ifms.detran.model.Carro;
import br.edu.ifms.detran.model.Infracao;
import br.edu.ifms.detran.model.Multa;
import br.edu.ifms.detran.repository.RepositoryApolice;
import br.edu.ifms.detran.repository.RepositoryCarro;
import br.edu.ifms.detran.repository.RepositoryInfracao;
import br.edu.ifms.detran.repository.RepositoryMulta;

@Service
public class DBService {
	@Autowired
	RepositoryCarro repositoryCarro;
	// esse autowire que faz a injeção de dependências 
	@Autowired
	RepositoryApolice repositoryApolice;
	@Autowired
	RepositoryInfracao repositoryInfracao;
	@Autowired
	RepositoryMulta repositoryMulta;
				
		public void instantiateTestDatabase() throws ParseException{
			
			//Construtorr
			// Carro(Long id, String nome, String marca, Integer modelo, int placa, String cor, Apolice apolice)
			//Apolice(Long id, float valor, String cobertura, String vigencia, Carro carro)
			//Infracao(Long id, String descricao, int pontos, float valor)
			//Multa(Long id, String cidade, int ano, Carro carro, Infracao infracao)
			
			//referencia depois instancia
			Carro c1= new  Carro(null, "Onix", "Chevrolet", 2014, 4110,"preto", null);			
			Carro c2= new  Carro(null, "FordKa", "Ford", 2019, 1146,"branco", null);
			Apolice apolice= new Apolice(null, 5000, "total", "12/2030", c2);
			Infracao infracao1= new Infracao (null, "velocidade alta", 21, 1500);
			Multa multa1 = new Multa(null, "corumba", 2022, c1, infracao1);
			
			repositoryApolice.saveAll(Arrays.asList(apolice));
			repositoryCarro.saveAll(Arrays.asList(c1,c2));
			repositoryInfracao.saveAll(Arrays.asList(infracao1));
			repositoryMulta.saveAll(Arrays.asList(multa1));
			
			
			
			
			
			
		}

	}
	


