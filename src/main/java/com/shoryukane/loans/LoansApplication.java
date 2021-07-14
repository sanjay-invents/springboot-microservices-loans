

package com.shoryukane.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RefreshScope
@ComponentScans({ @ComponentScan({ "com.shoryukane.loans.controller" }) })
@EnableJpaRepositories({ "com.shoryukane.loans.repository" })
@EntityScan({ "com.shoryukane.loans.model" })
public class LoansApplication
{
    public static void main(final String[] args) {
        SpringApplication.run((Class)LoansApplication.class, args);
    }
}
