package Instanciar;

import java.util.Scanner;

public class Calculadora {

    Scanner calc = new Scanner(System.in);

    String nome;
    int idade;


    double a;
    double b;
    double res;
    
    void dados() {
        System.out.println("Digite seu nome: ");
        nome = calc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = calc.nextInt();

        System.out.println();

         System.out.println("Digite o valor de A: ");
         a = calc.nextDouble();

         System.out.println("Digite o valor de B: ");
         a = calc.nextDouble();

         double res= a + b;
         System.out.println("O valor da soma é: " + res);

    }
    
    void somar() {
    double a = 10;
    double b = 10;
    double res = a + b;
    System.out.println("O valor da soma é: " + res);

    }
}