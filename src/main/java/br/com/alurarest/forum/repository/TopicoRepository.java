package br.com.alurarest.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alurarest.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	// Irá pegar o atributo nome da entidade Curso que se relaciona com Topico
	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

}
