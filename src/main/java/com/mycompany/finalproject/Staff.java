package com.mycompany.finalproject;

abstract class Staff {
    private String nic;
    private String email;
    private double salary;
    private String address;
    private String mobile;
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
    
    
    
}
