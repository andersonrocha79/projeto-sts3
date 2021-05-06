package br.com.rochasoft.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rochasoft.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> 
{

}
