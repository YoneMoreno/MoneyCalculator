/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.model;

/**
 *
 * @author usuario
 */
public class Money {
    private final double amount;
    private final Currency currency;

    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
}
