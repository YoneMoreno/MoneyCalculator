/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.model;

/**
 *
 * @author usuario
 */
public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final double amount;

    public ExchangeRate(Currency from, Currency to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getAmount() {
        return amount;
    }
    
    
}
