package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTernimal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por Favor, digite o número da Agência !");
        agencia = sc.next();

        System.out.println("Por Favor, digite o número da Conta !");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Por Favor, digite seu nome completo !");
        nomeCliente = sc.nextLine();

        System.out.println("Por Favor, digite o saldo !");
        saldo = sc.nextDouble();



        System.out.println("Olá "+ nomeCliente +" obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
                ", conta " + numero
                +" e seu saldo " +
                saldo +
                " já está disponível para saque");










        sc.close();


    }

}
