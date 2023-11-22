package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidades.VendedorEntidade;


@Repository
public interface VendedoresRepository extends JpaRepository<VendedorEntidade, Long>{

}
