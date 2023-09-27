package br.com.vanessa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vanessa.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>  {

}
