// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.wireandwheel.demonstrations.domain;

import com.wireandwheel.demonstrations.domain.Person;

privileged aspect Person_Roo_JavaBean {
    
    public String Person.getFirstname() {
        return this.firstname;
    }
    
    public void Person.setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String Person.getLastname() {
        return this.lastname;
    }
    
    public void Person.setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String Person.getEmail() {
        return this.email;
    }
    
    public void Person.setEmail(String email) {
        this.email = email;
    }
    
    public String Person.getOrganization() {
        return this.organization;
    }
    
    public void Person.setOrganization(String organization) {
        this.organization = organization;
    }
    
}
