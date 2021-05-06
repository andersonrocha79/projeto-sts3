package br.com.rochasoft.dsvendas.dto;

import java.io.Serializable;

import br.com.rochasoft.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private String 	sellerName;
	private Double	sum;
	
	public SaleSumDTO() 
	{
		super();
	}

	public SaleSumDTO(Seller seller, Double sum) 
	{
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
	

}
