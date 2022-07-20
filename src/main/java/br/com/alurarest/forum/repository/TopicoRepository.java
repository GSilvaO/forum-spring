package br.com.alurarest.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alurarest.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	// Irá pegar o atributo nome da entidade Curso que se relaciona com Topico
	List<Topico> findByCursoNome(String nomeCurso);

}
