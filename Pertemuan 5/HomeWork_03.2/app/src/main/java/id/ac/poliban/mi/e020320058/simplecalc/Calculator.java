package id.ac.poliban.mi.e020320058.simplecalc;

public class Calculator  {
    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL, POW}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        if (secondOperand == 0) throw new IllegalArgumentException("Can't divide with zero");
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, secondOperand);
    }
}