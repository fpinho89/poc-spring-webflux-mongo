package br.com.example.poc.controller

import br.com.example.poc.domain.Account
import br.com.example.poc.repository.AccountRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class AccountController(val repository: AccountRepository) {

    @GetMapping("/customer/{customer}")
    fun findByCustomer(@PathVariable("customer") customerId: String): Flux<Account> {
        return this.repository.findByCustomerId(customerId)
    }

    @GetMapping("customer")
    fun getAll(): Flux<Account> {
        return this.repository.findAll()
    }
}