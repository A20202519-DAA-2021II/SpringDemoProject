package idat.edu.pe.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiPrimerDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerDemo2Application.class, args);
		System.out.println("Arranacando aplicación en Tomcat embebido");
		
	}

}
