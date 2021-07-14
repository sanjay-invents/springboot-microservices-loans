

package com.shoryukane.loans.model;

import java.util.List;
import java.util.Map;

public class Properties
{
    private String msg;
    private String buildVersion;
    private Map<String, String> mailDetails;
    private List<String> activeBranches;
    
    public Properties(final String msg, final String buildVersion, final Map<String, String> mailDetails, final List<String> activeBranches) {
        this.msg = msg;
        this.buildVersion = buildVersion;
        this.mailDetails = mailDetails;
        this.activeBranches = activeBranches;
    }
    
    public String getMsg() {
        return this.msg;
    }
    
    public String getBuildVersion() {
        return this.buildVersion;
    }
    
    public Map<String, String> getMailDetails() {
        return (Map<String, String>)this.mailDetails;
    }
    
    public List<String> getActiveBranches() {
        return (List<String>)this.activeBranches;
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
}
