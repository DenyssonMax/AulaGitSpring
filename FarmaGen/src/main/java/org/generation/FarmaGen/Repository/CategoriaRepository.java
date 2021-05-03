package org.generation.FarmaGen.Repository;

import java.util.List;

import org.generation.FarmaGen.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	 public List<Categoria> findAllByDepartamentoContainingIgnoreCase(String departamento);

}
