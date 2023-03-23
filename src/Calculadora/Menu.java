package Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number1;
        double number2;
        int repeticao;
        int operacao;
        double resul;
        ArrayList<String> historico = new ArrayList<>();
        ArrayList<String> listagem = new ArrayList<>();
        ArrayList<Double> listagemconvertida = new ArrayList<>();

        Adicao adicionar = new Adicao();
        Subtracao subtrair = new Subtracao();
        Multiplicacao multiplicar = new Multiplicacao();
        Divisao dividir = new Divisao();
        Potenciacao potencia = new Potenciacao();
        Raiz raizqualquer = new Raiz();


        do {
            System.out.println("""
                    operação:\s
                        0 = Sair;\s
                        1 = soma;\s
                        2 = subtração;\s
                        3 = multiplicação\s
                        4 = divisão\s
                        5 = potenciação\s
                        6 = Raiz\s
                    """);

            String lista = input.next();
            listagem.add(lista);
            String[] corta = lista.split(";");
            number1 = Double.parseDouble(corta[0]);
            number2 = Double.parseDouble(corta[1]);
            operacao = Integer.parseInt(corta[2]);

            try {
                Validacao.validar(number2, operacao);
                switch (operacao) {
                    case 1:
                        resul = adicionar.operacao1(number1, number2);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2, 1, resul));
                        break;
                    case 2:
                        resul = subtrair.operacao1(number1, number2);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2, 2, resul));
                        break;
                    case 3:
                        resul = multiplicar.operacao1(number1, number2);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2, 3, resul));
                        break;
                    case 4:
                        resul = dividir.operacao1(number1, number2);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2, 4, resul));
                        break;
                    case 5:
                        resul = potencia.operacao1(number1, number2);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2, 5, resul));
                        break;
                    case 6:
                        resul = raizqualquer.operacao1(number1, number2);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2, 6, resul));
                        break;

                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        } while (operacao != 0);

        for (String resultadofinal : historico) {
            System.out.println(resultadofinal);
        }

    }
}

