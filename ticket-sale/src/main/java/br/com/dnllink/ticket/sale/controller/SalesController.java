package br.com.dnllink.ticket.sale.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class SalesController {

	@Value("${sales.offers.name:Oferta}")
	private String offerName;

	@Value("${sales.offers.price:R$ 29,90}")
	private String offerPrice;

	@GetMapping
	public String getSales() {
		return offerName + " " + offerPrice;
	}

}
