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

        Adição adicionar = new Adição();
        Subtração subtrair = new Subtração();
        Multiplicação multiplicar = new Multiplicação();
        Divisão dividir = new Divisão();
        Potenciação potencia = new Potenciação();

        do {
            System.out.println("operação:\n" +
                    "\n" +
                    "    1 = soma;\n" +
                    "    2 = subtração;\n" +
                    "    3 = multiplicação\n" +
                    "    4 = divisão\n" +
                    "    5 = potenciação\n");
            operacao = input.nextInt();

            System.out.println("Entre com o 1º valor");
            number1 = input.nextDouble();

            System.out.println("Entre com o 2º valor ");
            number2 = input.nextDouble();

            try {
                Validacao.validar(number2, operacao);
                switch (operacao){
                    case 1:
                        resul = adicionar.operacao1(number1,number2);
                        System.out.println(operacao + " " + " " + number1 + " " + number2 + " = " + resul);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2 , 1, resul));
                        break;
                    case 2:
                        resul = subtrair.operacao1(number1,number2);
                        System.out.println(operacao + " " + " " + number1 + " " + number2 + " = " + resul);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2 , 2, resul));
                        break;
                    case 3:
                        resul = multiplicar.operacao1(number1,number2);
                        System.out.println(operacao + " " + " " + number1 + " " + number2 + " = " + resul);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2 , 3, resul));
                        break;
                    case 4:
                        resul = dividir.operacao1(number1,number2);
                        System.out.println(operacao + " " + " " + number1 + " " + number2 + " = " + resul);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2 , 4, resul));
                        break;
                    case 5:
                        resul= potencia.operacao1(number1,number2);
                        System.out.println(operacao + " " + " " + number1 + " " + number2 + " = " + resul);
                        historico.add(String.format("%s;%s;%s = %s", number1, number2 , 5, resul));
                }
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }

            System.out.println("Voce deseja fazer outro calculo , digite 1 se sim ou 2 se não");
            repeticao = input.nextInt();


        }while (repeticao != 2);

        for (String resultadofinal: historico) {
            System.out.println(resultadofinal);
        }

        }
    }

