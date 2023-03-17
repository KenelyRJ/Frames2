package br.edu.ifms.detran.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifms.detran.dto.ApoliceDto;
import br.edu.ifms.detran.model.Apolice;
import br.edu.ifms.detran.repository.RepositoryApolice;

public class ApoliceService {
	@Autowired
	private RepositoryApolice repositoryApolice;
	
	public List<Apolice> buscarTodos(){
		return  repositoryApolice.findAll();
	}
		public Apolice buscarId(Long id) {
			Optional <Apolice> apolice = repositoryApolice.findById(id);
			return apolice.orElseThrow();
		}
		public Apolice inserir(Apolice apolice) {
			apolice.setId(null);
			return  repositoryApolice.save(apolice);
		}
		public void remover(Long id) {
			buscarId(id);
			 repositoryApolice.deleteById(id);
		}

		public Apolice atualizar(Apolice apolice) {
			Apolice apoliceNovo = buscarId(apolice.getId());
			apoliceNovo.setValor(apolice.getValor());
			apoliceNovo.setCobertura(apolice.getCobertura());
			apoliceNovo.setVigencia(apolice.getVigencia());
			
			return repositoryApolice.save(apoliceNovo);
		}
		//public Apolice(Long id, float valor, String cobertura, String vigencia, Carro carro)
			
			public Apolice fromDto(ApoliceDto apoliceDto) {
				return new Apolice(apoliceDto.getId(),apoliceDto.getValor(), apoliceDto.getCobertura(), null,null);
				
			}
			
	
	
			
	

}
