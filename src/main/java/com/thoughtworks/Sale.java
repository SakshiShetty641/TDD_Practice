package com.thoughtworks;

public class Sale {

    private long total;

    public Sale(long total) {
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public long getChange(long amount){
        return  amount - getTotal();
    }
}
