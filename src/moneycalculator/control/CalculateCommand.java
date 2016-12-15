/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.control;

import moneycalculator.ui.MoneyDialog;
import moneycalculator.ui.MoneyDisplay;

/**
 *
 * @author usuario
 */
public class CalculateCommand implements Command {
    private final MoneyDialog moneyDialog;
    private final MoneyDisplay moneyDisplay;

    public CalculateCommand(MoneyDialog moneyDialog, MoneyDisplay moneyDisplay) {
        this.moneyDialog = moneyDialog;
        this.moneyDisplay = moneyDisplay;
    }

    
    @Override
    public String name() {
        return "calculate";
    }

    @Override
    public void execute() {
        moneyDisplay.display(moneyDialog.get());
    }

}
