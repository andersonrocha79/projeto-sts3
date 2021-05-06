package br.com.rochasoft.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rochasoft.dsvendas.dto.SellerDTO;
import br.com.rochasoft.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController 
{
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll()
	{
		
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
		
	}

}
