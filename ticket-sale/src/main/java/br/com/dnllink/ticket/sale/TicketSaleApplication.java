package br.com.dnllink.ticket.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TicketSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketSaleApplication.class, args);
	}
}
