package com.mah312.springinaction.account;

import jakarta.persistence.Entity;

@Entity
public class CreditAccount extends Account {

    private Double creditLimit;

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }
}


