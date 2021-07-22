package com.example.SpringPlusHtml.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String lastName;
    private String firstName;
    private Integer balance;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return String.format(
        "Customer[id=%d, firstName='%s', lastName='%s', balance=%d]",
        id, firstName, lastName, balance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
