package br.com.dnllink.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TicketEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketEurekaServerApplication.class, args);
	}
}
