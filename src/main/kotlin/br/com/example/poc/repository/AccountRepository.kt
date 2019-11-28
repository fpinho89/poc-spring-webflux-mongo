package br.com.example.poc.repository

import br.com.example.poc.domain.Account
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux

@Repository
@Transactional
interface AccountRepository : ReactiveCrudRepository<Account, String> {

    fun findByCustomerId(customerId:String): Flux<Account>
}