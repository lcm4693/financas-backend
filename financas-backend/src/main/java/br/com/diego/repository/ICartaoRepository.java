package br.com.diego.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.diego.entity.Cartao;

public interface ICartaoRepository extends CrudRepository<Cartao, Integer>{

}
