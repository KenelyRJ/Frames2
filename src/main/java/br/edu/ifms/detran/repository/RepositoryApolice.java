package br.edu.ifms.detran.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.detran.model.Apolice;
@Repository
public interface RepositoryApolice extends JpaRepository<Apolice, Long> {

	void deleteById(Integer id);

	Optional<Apolice> findById(Integer integer);
	

}
