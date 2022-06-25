/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.customers.domain.entity;

/**
 * Representa un customer
 *
 */
public class Customer {
 private Integer id;
 private String fisrtName;
 private String lastname;
 private String address;
 private String mobile;
 private String email;
 private String gender;



    public Customer(Integer id, String fisrtName, String lastname, String address, String mobile, String email, String gender) {
        this.id = id;
        this.fisrtName = fisrtName;
        this.lastname = lastname;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
    }
    
    public Customer() {
        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
 @Override
 public String toString() {
 return "Customer{" + "id=" + id + ", fisrtName=" + fisrtName + ", lastname=" + lastname + 
         ", address=" + address + ", mobile=" + mobile + ", email=" + email + ", gender=" + gender +
'}';
 }
}