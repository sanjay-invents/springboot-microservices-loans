

package com.shoryukane.loans.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Loans
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_number")
    private int loanNumber;
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "start_dt")
    private Date startDt;
    @Column(name = "loan_type")
    private String loanType;
    @Column(name = "total_loan")
    private int totalLoan;
    @Column(name = "amount_paid")
    private int amountPaid;
    @Column(name = "outstanding_amount")
    private int outstandingAmount;
    @Column(name = "create_dt")
    private String createDt;
    
    public int getLoanNumber() {
        return this.loanNumber;
    }
    
    public int getCustomerId() {
        return this.customerId;
    }
    
    public Date getStartDt() {
        return this.startDt;
    }
    
    public String getLoanType() {
        return this.loanType;
    }
    
    public int getTotalLoan() {
        return this.totalLoan;
    }
    
    public int getAmountPaid() {
        return this.amountPaid;
    }
    
    public int getOutstandingAmount() {
        return this.outstandingAmount;
    }
    
    public String getCreateDt() {
        return this.createDt;
    }
    
    public void setLoanNumber(final int loanNumber) {
        this.loanNumber = loanNumber;
    }
    
    public void setCustomerId(final int customerId) {
        this.customerId = customerId;
    }
    
    public void setStartDt(final Date startDt) {
        this.startDt = startDt;
    }
    
    public void setLoanType(final String loanType) {
        this.loanType = loanType;
    }
    
    public void setTotalLoan(final int totalLoan) {
        this.totalLoan = totalLoan;
    }
    
    public void setAmountPaid(final int amountPaid) {
        this.amountPaid = amountPaid;
    }
    
    public void setOutstandingAmount(final int outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }
    
    public void setCreateDt(final String createDt) {
        this.createDt = createDt;
    }
    
    @Override
    public String toString() {
        return "Loans(loanNumber=" + this.getLoanNumber() + ", customerId=" + this.getCustomerId() + ", startDt=" + this.getStartDt() + ", loanType=" + this.getLoanType() + ", totalLoan=" + this.getTotalLoan() + ", amountPaid=" + this.getAmountPaid() + ", outstandingAmount=" + this.getOutstandingAmount() + ", createDt=" + this.getCreateDt() + ")";
    }
}
