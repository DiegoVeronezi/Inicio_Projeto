package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //recebe o nome
        System.out.println("digite o seu nome:");
        String nome = s.next();

        //recebe o sobrenome
        System.out.println("digite o seu sobrenome:");
        String sobreNome = s.next();

        //recebe o cpf
        System.out.println("digite o seu cpf: ");
        long cpf = s.nextLong();

        //recebe dia
        System.out.println("digite o dia de seu nascimento: ");
        int dia = s.nextInt();

        //recebe mes
        System.out.println("digite o mês de seu nascimento: ");
        int mes = s.nextInt();

        //recebe ano
        System.out.println("digite o ano de seu nascimento: ");
        int ano = s.nextInt();

        //recebe sexo
        System.out.println("Sexo M | F");
        String sexo = s.next();

        //recebe senha
        System.out.println("digite uma senha: ");
        String senha = s.next();

        //recebe a confirmação da senha
        System.out.println("confirme a senha: ");
        String senha2 =(String) s.next();

        //teste da senha
        while(!senha2.equals(senha)){

            System.out.println("Senha não confere! Repita novamente!");

            //recebe senha
            System.out.println("digite uma senha: ");
            senha = s.next();

            //recebe a confirmação da senha
            System.out.println("confirme a senha: ");
            senha2 = s.next();

        }

        System.out.println("Senha OK!");

        // imprime o nome completo
        System.out.println("Nome completo: " + nome + " " + sobreNome);



    }
}
