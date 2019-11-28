package br.com.example.poc

import br.com.example.poc.domain.Account
import br.com.example.poc.repository.AccountRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class PoCSpringWebFluxMongoApplication {

	@Bean
	fun init(repository: AccountRepository) = CommandLineRunner {

		for (i in 1..100000) {
			repository.save(Account(UUID.randomUUID().toString(), "2", UUID.randomUUID().toString(), 1)).subscribe()
		}
	}

}

fun main(args: Array<String>) {
	runApplication<PoCSpringWebFluxMongoApplication>(*args)
}
