package main.java;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import main.java.entity.Medidor;
import main.java.utils.HttpConnectionMethods;

@SpringBootApplication
public class ProjIntegracaoApirestApplication {
	
	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(ProjIntegracaoApirestApplication.class, args);
		
	}
	
}
