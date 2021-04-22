package loja.tax;

import java.math.BigDecimal;

import loja.bugdet.Budget;

public class ISS implements Tax {
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }

}
