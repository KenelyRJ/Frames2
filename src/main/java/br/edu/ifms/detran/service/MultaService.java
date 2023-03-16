package br.edu.ifms.detran.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifms.detran.dto.MultaDto;
import br.edu.ifms.detran.model.Multa;
import br.edu.ifms.detran.repository.RepositoryMulta;

public class MultaService {
	@Autowired
	private RepositoryMulta repositoryMulta;
	
	
		public List<Multa> buscarTodos(){
		return repositoryMulta.findAll();
	}
		public Multa buscarId(Long id) {
			Optional <Multa> multa = repositoryMulta.findById(id);
			return multa.orElseThrow();
		}
		public Multa inserir(Multa multa) {
			multa.setId(null);
			return repositoryMulta.save(multa);
		}
		public void remover(Long id) {
			buscarId(id);
			repositoryMulta.deleteById(id);
		}

		public Multa atualizar(Multa multa) {
			Multa multaNovo = buscarId(multa.getId());
			multaNovo.setCidade(multa.getCidade());
			multaNovo.setCarro(multa.getCarro());
			multaNovo.setInfracao(multa.getInfracao());
			
			return repositoryMulta.save(multaNovo);
		}
			// Long id, String cidade, int ano, Carro carro, Infracao infracao)
			
			public Multa fromDto(MultaDto multaDto) {
				return new Multa(multaDto.getId(), multaDto.getCidade(),multaDto.getAno() , null,null);
				
			}
			
		


}
