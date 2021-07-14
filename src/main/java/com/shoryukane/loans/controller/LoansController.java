

package com.shoryukane.loans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.util.Map;
import com.shoryukane.loans.model.Properties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import com.shoryukane.loans.model.Loans;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import com.shoryukane.loans.model.Customer;
import com.shoryukane.loans.config.LoansServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import com.shoryukane.loans.repository.LoansRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController
{
    @Autowired
    private LoansRepository loansRepository;
    @Autowired
    private LoansServiceConfig loansServiceConfig;
    
    @PostMapping({ "/myLoans" })
    public List<Loans> getLoanDetails(@RequestBody final Customer customer) {
        return (List<Loans>)this.loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
    }
    
    @GetMapping({ "/loans/properties" })
    public String getPropertyDetails() throws JsonProcessingException {
        final ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        final Properties properties = new Properties(this.loansServiceConfig.getMsg(), this.loansServiceConfig.getBuildVersion(), (Map)this.loansServiceConfig.getMailDetails(), (List)this.loansServiceConfig.getActiveBranches());
        return objectWriter.writeValueAsString((Object)properties);
    }
}
