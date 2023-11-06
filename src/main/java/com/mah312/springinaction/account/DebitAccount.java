package com.mah312.springinaction.account;

import jakarta.persistence.Entity;

@Entity
public class DebitAccount extends Account {

    private Double overdraftFee;

    public Double getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(Double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }
}
