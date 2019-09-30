package com.bank.b.services.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bank.b.services.account.repository.BankAccountRepository;
import com.bank.b.services.account.repository.BankTransactionRepository;
import com.bank.b.services.model.Account;
import com.bank.b.services.model.AccountType;
import com.bank.b.services.model.Transaction;
import com.bank.b.services.model.TransactionType;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class BankAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAccountApplication.class, args);
	}

	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.basePackage("com.bank.a.services.account.controller"))
					.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Account API for Bank-A").description("Documentation Bank-A API v1.0").build());
	}
	
	@Bean
	BankAccountRepository repository() {
		BankAccountRepository repository = new  BankAccountRepository();
		repository.add(new Account(3L, "4", "branch-a" , "4000-1" , AccountType.SAVINGS,"testKey-1"));
		repository.add(new Account(4L, "4", "branch-a" , "4000-2" , AccountType.SAVINGS,"testKey-2"));

		return repository;
	}
	
	@Bean
	BankTransactionRepository transactionRepository() {
		BankTransactionRepository  repo = new BankTransactionRepository();
		repo.add(3L, new Transaction(TransactionType.DEBIT, null, 1000L, "4000-1" , 3L , 4L));
		repo.add(3L, new Transaction(TransactionType.CREDIT, null, 2700L, "4000-1" , 3L , 4L));

		repo.add(3L, new Transaction(TransactionType.DEBIT, null, 100000, "4000-1" , 3L , 4L));
		repo.add(3L, new Transaction(TransactionType.DEBIT, null, 20062, "4000-1" , 3L , 4L));
		
		return repo;
	}
	
}
