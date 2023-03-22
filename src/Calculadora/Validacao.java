package Calculadora;

public class Validacao {

    public static void validar(double number2, int operacao ){
        if (number2 == 0 && operacao == 4 ){
            throw new RuntimeException("Divisão não pode ser feita por 0");
        }

    }
}
