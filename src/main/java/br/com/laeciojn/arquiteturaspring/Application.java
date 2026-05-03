package br.com.laeciojn.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		builder.bannerMode(Banner.Mode.OFF); //desligar o banner do spring
		builder.profiles("producao"); //ativar perfil de produção, ex subir aplicação  em produção
		builder.run(args);

		//Contexto da aplicacao iniciada
		ConfigurableApplicationContext applicationContext = builder.context();
		//var produtoRepository = applicationContext.getBean("produtoRepository");

		//builder.properties("spring.datasource.url=jdbc"); //criar properties -> usar ao inves do properties ja criado

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String applicationName = environment.getProperty("");
	}

}
