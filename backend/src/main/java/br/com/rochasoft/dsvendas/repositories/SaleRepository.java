package br.com.rochasoft.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.rochasoft.dsvendas.dto.SaleSuccessDTO;
import br.com.rochasoft.dsvendas.dto.SaleSumDTO;
import br.com.rochasoft.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> 
{
	
	// jpql
	@Query("SELECT new br.com.rochasoft.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount) ) " +
	       " FROM  Sale AS obj " + 
		   " GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	// jpql
	@Query("SELECT new br.com.rochasoft.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited) , SUM(obj.deals)) " +
	       " FROM  Sale AS obj " + 
		   " GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();	

}
