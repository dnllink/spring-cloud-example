package br.com.dnllink.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class TicketZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketZuulServerApplication.class, args);
	}
}
