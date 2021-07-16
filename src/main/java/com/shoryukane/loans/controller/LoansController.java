package com.shoryukane.loans.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.util.Map;
import com.shoryukane.loans.model.Properties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shoryukane.loans.model.Loans;
import java.util.List;

import com.shoryukane.loans.model.Customer;
import com.shoryukane.loans.config.LoansServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import com.shoryukane.loans.repository.LoansRepository;

@RestController
public class LoansController
{
    private static final Logger logger = LoggerFactory.getLogger(LoansController.class);

    @Autowired
    private LoansRepository loansRepository;

    @Autowired
    private LoansServiceConfig loansServiceConfig;
    
    @PostMapping({ "/myLoans" })
    public List<Loans> getLoanDetails(@RequestHeader("shoryukane-correlation-id") String correlationId, @RequestBody final Customer customer) {
        logger.info("Inside myLoans method.");
        return this.loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
    }
    
    @GetMapping({ "/loans/properties" })
    public String getPropertyDetails() throws JsonProcessingException {
        final ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        final Properties properties = new Properties(this.loansServiceConfig.getMsg(), this.loansServiceConfig.getBuildVersion(), this.loansServiceConfig.getMailDetails(), this.loansServiceConfig.getActiveBranches());
        return objectWriter.writeValueAsString(properties);
    }
}
