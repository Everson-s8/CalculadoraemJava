package Calculadora;

public class Potenciação implements Ioperacao{
    @Override
    public double operacao1(double number1, double number2) {
        return Math.pow(number1,number2);
    }
}
