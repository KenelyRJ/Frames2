package br.edu.ifms.detran.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.detran.model.Apolice;
import br.edu.ifms.detran.model.Carro;
import br.edu.ifms.detran.repository.RepositoryApolice;
import br.edu.ifms.detran.repository.RepositoryCarro;
import br.edu.ifms.detran.repository.RepositoryInfracao;

@Service
public class DBService {
	@Autowired
	RepositoryCarro repositoryCarro;
	// esse autowire que faz a injeção de dependências 
	@Autowired
	RepositoryApolice repositoryApolice;
	@Autowired
	RepositoryInfracao repositoryInfracao;
				
		public void instantiateTestDatabase() throws ParseException{
			
			//referencia depois instancia
			// Carro(Long id, String nome, String marca, Integer modelo, int placa, String cor, Apolice apolice)
			//Infracao(Long id, String descricao, int pontos, float valor)
			//Apolice(Long id, float valor, String cobertura, String vigencia, Carro carro)
			Carro c1= new  Carro(null, "Onix", "Chevrolet", 2014, 4110,"preto", null);
			
			Carro c2= new  Carro(null, "FordKa", "Ford", 2019, 1146,"branco", null);
		
			
			Apolice apolice= new Apolice(null, 5000, "total", "12/2030", c2);
			
			repositoryApolice.saveAll(Arrays.asList(apolice));
			repositoryCarro.saveAll(Arrays.asList(c1,c2));
			repositoryInfracao.saveAll(null);
			
			
			
			
			
		}

	}
	


