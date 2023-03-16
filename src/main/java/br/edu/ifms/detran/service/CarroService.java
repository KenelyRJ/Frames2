package br.edu.ifms.detran.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.detran.dto.CarroDto;
import br.edu.ifms.detran.model.Carro;
import br.edu.ifms.detran.repository.RepositoryCarro;

//para importar pacotes ctrl+espaço
@Service
public class CarroService  {
	@Autowired
	private RepositoryCarro repositoryCarro;
	
	
		public List<Carro> buscarTodos(){
		return repositoryCarro.findAll();
	}
		public Carro buscarId(Long id) {
			Optional <Carro> carro = repositoryCarro.findById(id);
			return carro.orElseThrow();
		}
		public Carro inserir(Carro carro) {
			carro.setId(null);
			return repositoryCarro.save(carro);
		}
		public void remover(Long id) {
			buscarId(id);
			repositoryCarro.deleteById(id);
		}

		public Carro atualizar(Carro carro) {
			Carro carroNovo = buscarId(carro.getId());
			carroNovo.setNome(carro.getNome());
			carroNovo.setPlaca(carro.getPlaca());
			carroNovo.setModelo(carro.getModelo());
			carroNovo.setMarca(carro.getMarca());
			carroNovo.setCor(carro.getCor());
			return repositoryCarro.save(carroNovo);
		}
			//(Long id, String nome, String marca, Integer modelo, int placa, String cor, Apolice apolice
			
			public Carro fromDto(CarroDto carroDto) {
				return new Carro(carroDto.getId(), carroDto.getNome(), carroDto.getMarca(), carroDto.getModelo(), carroDto.getPlaca(),carroDto.getCor(), null);
				
			}
			//public List<Carro> buscarPlaca(String str){
			//	return repositoryCarro.findPlacaContaing(str);
			//}
		
}
