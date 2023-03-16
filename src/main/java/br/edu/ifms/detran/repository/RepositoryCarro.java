package br.edu.ifms.detran.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.detran.model.Carro;
@Repository
public interface RepositoryCarro extends JpaRepository<Carro, Long>{

	//List<Carro> findPlacaContaing(String str);

	
	

	
	
}
