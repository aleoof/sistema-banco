package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int login;
        int options;
        boolean replayOperation;
        Scanner read = new Scanner(System.in);

        Client client = new Client();
        Conta conta = new Conta();

        client.setName("josé da silva");
        client.setId(123);
        System.out.println("Inserir senha");
        replayOperation = true;

        login = read.nextInt();
         if (login == client.getId()){
             System.out.println("olá senhor "+client.getName()+", o que gostaria de efetuar hj ??");
             conta.setSaldo(1000);
             while(replayOperation) {

                 System.out.println("1-sacar 2-depositar 3-consultar 4-sair");
                 options = read.nextInt();
                 switch (options) {
                     case 1:
                         System.out.println("Por favor inform o valor a ser retirado");
                         conta.setRetirada(read.nextDouble());
                         System.out.println("Seu novo saldo é de: " + conta.getSaldo());
                         break;
                     case 2:
                         System.out.println("Por favor inform o valor a ser depositado");
                         conta.setDeposito(read.nextDouble());
                         System.out.println("Seu novo saldo é de: " + conta.getSaldo());
                         break;
                     case 3:
                         System.out.println("Seu saldo é de: " + conta.getSaldo());
                         break;
                     case 4:
                         System.out.println("Obrigado por ultilizar nosso caixa");
                         replayOperation = false;
                         break;

                 }
             }
         }
    }
}
