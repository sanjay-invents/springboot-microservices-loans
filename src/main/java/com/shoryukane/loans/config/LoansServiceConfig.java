

package com.shoryukane.loans.config;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "loans")
public class LoansServiceConfig
{
    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
    private List<String> activeBranches;
    
    public String getMsg() {
        return this.msg;
    }
    
    public String getBuildVersion() {
        return this.buildVersion;
    }
    
    public Map<String, String> getMailDetails() {
        return this.mailDetails;
    }
    
    public List<String> getActiveBranches() {
        return this.activeBranches;
    }
    
    public void setMsg(final String msg) {
        this.msg = msg;
    }
    
    public void setBuildVersion(final String buildVersion) {
        this.buildVersion = buildVersion;
    }
    
    public void setMailDetails(final Map<String, String> mailDetails) {
        this.mailDetails = mailDetails;
    }
    
    public void setActiveBranches(final List<String> activeBranches) {
        this.activeBranches = activeBranches;
    }
    
    @Override
    public String toString() {
        return "LoansServiceConfig(msg=" + this.getMsg() + ", buildVersion=" + this.getBuildVersion() + ", mailDetails=" + this.getMailDetails() + ", activeBranches=" + this.getActiveBranches() + ")";
    }
}
