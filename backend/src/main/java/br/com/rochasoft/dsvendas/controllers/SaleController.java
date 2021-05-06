package br.com.rochasoft.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rochasoft.dsvendas.dto.SaleDTO;
import br.com.rochasoft.dsvendas.dto.SaleSuccessDTO;
import br.com.rochasoft.dsvendas.dto.SaleSumDTO;
import br.com.rochasoft.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sale")
public class SaleController 
{
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	// http://localhost:8080/sale
	// http://localhost:8080/sale?page=1	
	// http://localhost:8080/sale?page=1&size=30&sort=date,desc
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable)
	{
		
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping(value="/amount-by-seller")
	// http://localhost:8080/sale/amount-by-seller
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller()
	{
		
		List<SaleSumDTO> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);
		
	}	
	
	@GetMapping(value="/success-by-seller")
	// http://localhost:8080/sale/success-by-seller
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller()
	{
		
		List<SaleSuccessDTO> list = service.successGroupedBySeller();
		return ResponseEntity.ok(list);
		
	}		

}
