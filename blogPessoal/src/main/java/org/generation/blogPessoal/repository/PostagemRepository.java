package org.generation.blogPessoal.repository;

import java.util.List;
import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// aplicação responsável pela comunicação com o banco de dados 
@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	//public List<Postagem> findAllByTituloContaingIgnoreCase(String titulo); // para instanciar tudo que estiver em titulo na classe model 
	
}
