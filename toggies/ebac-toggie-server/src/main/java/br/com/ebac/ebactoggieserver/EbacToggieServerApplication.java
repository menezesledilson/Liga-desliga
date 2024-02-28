package br.com.ebac.ebactoggieserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EbacToggieServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbacToggieServerApplication.class, args);
	}

}
