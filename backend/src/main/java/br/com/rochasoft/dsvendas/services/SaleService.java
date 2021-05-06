package br.com.rochasoft.dsvendas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.rochasoft.dsvendas.dto.SaleDTO;
import br.com.rochasoft.dsvendas.dto.SaleSuccessDTO;
import br.com.rochasoft.dsvendas.dto.SaleSumDTO;
import br.com.rochasoft.dsvendas.entities.Sale;
import br.com.rochasoft.dsvendas.repositories.SaleRepository;
import br.com.rochasoft.dsvendas.repositories.SellerRepository;

@Service
public class SaleService 
{
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly=true)
	public Page<SaleDTO> findAll(Pageable pageable)
	{
		
		// armazena os vendedores para que fique em cache
		// e não precise buscar o vendedor quando tiver buscando os Sales
		sellerRepository.findAll();
		
		Page<Sale> result = repository.findAll(pageable);
		
		return result.map(x -> new SaleDTO(x));
		
	}
	
	@Transactional(readOnly=true)
	public List<SaleSumDTO> amountGroupedBySeller()
	{
		return repository.amountGroupedBySeller();
	}

	
	@Transactional(readOnly=true)
	public List<SaleSuccessDTO> successGroupedBySeller()
	{
		return repository.successGroupedBySeller();
	}	
}
