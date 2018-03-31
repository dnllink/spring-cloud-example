package br.com.dnllink.ticket.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class TicketConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketConfigServerApplication.class, args);
	}
}
