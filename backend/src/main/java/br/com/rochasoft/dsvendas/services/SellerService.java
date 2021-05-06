package br.com.rochasoft.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rochasoft.dsvendas.dto.SellerDTO;
import br.com.rochasoft.dsvendas.entities.Seller;
import br.com.rochasoft.dsvendas.repositories.SellerRepository;

@Service
public class SellerService 
{
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll()
	{
		
		List<Seller> result = repository.findAll();
		
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

	
}
