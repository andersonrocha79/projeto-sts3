package br.com.rochasoft.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rochasoft.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> 
{

}
