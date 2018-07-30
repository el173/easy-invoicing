package modal;
// Generated Jul 31, 2018 12:10:32 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private Integer idclient;
     private TaxType taxType;
     private String name;
     private String address;
     private String email;
     private String vatNum;
     private String svatNum;
     private Boolean nbtStatus;
     private Boolean vatStatus;
     private Set projects = new HashSet(0);

    public Client() {
    }

	
    public Client(TaxType taxType) {
        this.taxType = taxType;
    }
    public Client(TaxType taxType, String name, String address, String email, String vatNum, String svatNum, Boolean nbtStatus, Boolean vatStatus, Set projects) {
       this.taxType = taxType;
       this.name = name;
       this.address = address;
       this.email = email;
       this.vatNum = vatNum;
       this.svatNum = svatNum;
       this.nbtStatus = nbtStatus;
       this.vatStatus = vatStatus;
       this.projects = projects;
    }
   
    public Integer getIdclient() {
        return this.idclient;
    }
    
    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }
    public TaxType getTaxType() {
        return this.taxType;
    }
    
    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getVatNum() {
        return this.vatNum;
    }
    
    public void setVatNum(String vatNum) {
        this.vatNum = vatNum;
    }
    public String getSvatNum() {
        return this.svatNum;
    }
    
    public void setSvatNum(String svatNum) {
        this.svatNum = svatNum;
    }
    public Boolean getNbtStatus() {
        return this.nbtStatus;
    }
    
    public void setNbtStatus(Boolean nbtStatus) {
        this.nbtStatus = nbtStatus;
    }
    public Boolean getVatStatus() {
        return this.vatStatus;
    }
    
    public void setVatStatus(Boolean vatStatus) {
        this.vatStatus = vatStatus;
    }
    public Set getProjects() {
        return this.projects;
    }
    
    public void setProjects(Set projects) {
        this.projects = projects;
    }




}


