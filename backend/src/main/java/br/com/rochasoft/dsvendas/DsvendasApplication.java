package br.com.rochasoft.dsvendas;

/*
criando aplicação no heroku
heroku -v
heroku login
heroku git:remote -a <nome-do-app>
git remote -v
git subtree push --prefix backend heroku main
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsvendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsvendasApplication.class, args);
	}

}
