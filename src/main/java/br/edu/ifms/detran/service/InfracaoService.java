package br.edu.ifms.detran.service;

import java.util.List;
import java.util.Optional;

import br.edu.ifms.detran.dto.InfracaoDto;
import br.edu.ifms.detran.dto.InfracaoDto;
import br.edu.ifms.detran.model.Carro;
import br.edu.ifms.detran.model.Infracao;
import br.edu.ifms.detran.repository.RepositoryCarro;
import br.edu.ifms.detran.repository.RepositoryInfracao;

public class InfracaoService {
	private RepositoryInfracao repositoryInfracao;

	public List<Infracao> buscarTodos(){
	return repositoryInfracao.findAll();
}
	public Infracao buscarId(Long id) {
		Optional <Infracao> infracao = repositoryInfracao.findById(id);
		return infracao.orElseThrow();
	}
	public Infracao inserir(Infracao infracao) {
		infracao.setId(null);
		return repositoryInfracao.save(infracao);
	}
	public void remover(Long id) {
		buscarId(id);
		repositoryInfracao.deleteById(id);
	}

	public Infracao atualizar(Infracao infracao) {
		Infracao infracaoNova = buscarId(infracao.getId());
		infracaoNova.setDescricao(infracao.getDescricao());
		infracaoNova.setPontos(infracao.getPontos());
		infracaoNova.setValor(infracao.getValor());
		return repositoryInfracao.save(infracaoNova);
	}
		//ordem do construtor cheio(Long id, String descricao, int pontos, float valor)
		
		public Infracao fromDto(InfracaoDto infracaoDto) {
			return new Infracao(infracaoDto.getId(), infracaoDto.getDescricao(), infracaoDto.getPontos(), infracaoDto.getValor());
			
		}
	



}
