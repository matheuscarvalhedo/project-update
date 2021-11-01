package com.testejava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.testejava.model.Refeicao;

@Repository
public interface RefeicaoRepository extends JpaRepository<Refeicao, Long> {
	
	@Query(value = "select u from Refeicao u where u.nome like %?1%")
	List<Refeicao> buscarPorNome(String nome);
	
}
