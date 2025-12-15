package br.com.qwasolucoes.sm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmApplication {

	static void main(String[] args) {
		System.out.println("DB_URL_CONNECTION = " + System.getenv("DB_URL_CONNECTION"));
		System.out.println("DB_DRIVER_CLASS = " + System.getenv("DB_DRIVER_CLASS"));
		System.out.println("DB_USERNAME = " + System.getenv("DB_USERNAME"));
		System.out.println("DB_PASSWORD = " + System.getenv("DB_PASSWORD"));
		System.out.println("API_APININJA_URL = " + System.getenv("API_APININJA_URL"));
		System.out.println("API_APININJA_TOKEN = " + System.getenv("API_APININJA_TOKEN"));
		SpringApplication.run(SmApplication.class, args);
	}

}
