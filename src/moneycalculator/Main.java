/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator;

import moneycalculator.control.CalculateCommand;
import moneycalculator.model.Currency;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame(currencies());
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDialog(),
                mainFrame.getMoneyDisplay()));
    }

    private static Currency[] currencies() {
        return new Currency[]{
            new Currency("USD", "Dolar USA", "$"),
            new Currency("CAD", "Dolar Canada", "$"),
            new Currency("GBP", "Libra esterlina", "£"),};
    }
}
