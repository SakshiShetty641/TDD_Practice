package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SaleTest {

    @Test
    void shouldReturnTrueWhenCorrectChangeReturned() {
        Sale sale = new Sale(1000);

        long result = sale.getChange(5000);

        assertEquals(4000, result);

    }
}
