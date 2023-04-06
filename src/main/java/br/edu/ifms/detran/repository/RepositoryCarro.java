package br.edu.ifms.detran.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.detran.model.Carro;
@Repository
public interface RepositoryCarro extends JpaRepository<Carro, Long>{

	Optional<Carro> findById(Integer integer);

	void deleteById(Integer id);

	//List<Carro> findPlacaContaing(String str);

	
	

	
	
}
