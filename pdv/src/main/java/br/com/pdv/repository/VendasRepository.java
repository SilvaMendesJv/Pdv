package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidades.VendaEntidade;



@Repository
public interface VendasRepository extends JpaRepository<VendaEntidade, Long>{

}
