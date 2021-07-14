

package com.shoryukane.loans.model;

import java.time.LocalDate;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer
{
    @Column(name = "customer_id")
    @Id
    private int customerId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "create_dt")
    private LocalDate createDt;
    
    public int getCustomerId() {
        return this.customerId;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    
    public LocalDate getCreateDt() {
        return this.createDt;
    }
    
    public void setCustomerId(final int customerId) {
        this.customerId = customerId;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setMobileNumber(final String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public void setCreateDt(final LocalDate createDt) {
        this.createDt = createDt;
    }
    
    @Override
    public String toString() {
        return "Customer(customerId=" + this.getCustomerId() + ", name=" + this.getName() + ", email=" + this.getEmail() + ", mobileNumber=" + this.getMobileNumber() + ", createDt=" + this.getCreateDt() + ")";
    }
}
