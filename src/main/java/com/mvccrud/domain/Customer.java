package com.mvccrud.domain;

public class Customer {
    int custID;
    String custName;

    public Customer(int custID, String custName) {
        this.custID = custID;
        this.custName = custName;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
}
