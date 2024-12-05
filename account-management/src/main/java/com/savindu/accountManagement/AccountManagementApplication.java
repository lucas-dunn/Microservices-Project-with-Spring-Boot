package com.savindu.accountManagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
public class AccountManagementApplication {


	public static void main(String[] args) {
		SpringApplication.run(AccountManagementApplication.class, args);
	}

}
