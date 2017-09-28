package com.company;

import java.util.Scanner;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        Onibus fatima = new Onibus("fatima");

        LeituraArquivos la = new LeituraArquivos("fatima.txt");

        fatima.setHorarios(la.lerArquivo());



        Scanner s = new Scanner(System.in);


     /*
        //recebe o nome
        System.out.println("digite o seu nome:");
        minhaConta.setNome(s.next());

        //recebe o sobrenome
        System.out.println("digite o seu sobrenome:");
        minhaConta.setSobreNome();

        //recebe o cpf
        System.out.println("digite o seu cpf: ");
        minhaConta.cpf = s.nextLong();

        //recebe dia
        System.out.println("digite o dia de seu nascimento: ");
        minhaConta.dia = s.nextInt();

        //recebe mes
        System.out.println("digite o mês de seu nascimento: ");
        minhaConta.mes = s.nextInt();

        //recebe ano
        System.out.println("digite o ano de seu nascimento: ");
        minhaConta.ano = s.nextInt();

        //recebe sexo
        System.out.println("Sexo M | F");
        minhaConta.sexo = s.next();

        //recebe senha
        System.out.println("digite uma senha: ");
        minhaConta.senha = s.next();

        //recebe a confirmação da senha
        System.out.println("confirme a senha: ");
        minhaConta.senha2 = s.next();

        //teste da senha
        while(!minhaConta.senha2.equals(minhaConta.senha)){

            System.out.println("Senha não confere! Repita novamente!");

            //recebe senha
            System.out.println("digite uma senha: ");
            minhaConta.senha = s.next();

            //recebe a confirmação da senha
            System.out.println("confirme a senha: ");
            minhaConta.senha2 = s.next();

        }

        System.out.println("Senha OK!");

        // imprime o nome completo
        System.out.println("Nome completo: " + minhaConta.nome + " " + minhaConta.sobreNome);

        */

        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int min = data.get(Calendar.MINUTE);
        System.out.println(hora+":"+min);


        System.out.println("digite a linha do ônibus:");
        String bus = s.next();

       if (fatima.getLinha().equals(bus)) {



            for (int i = 0; i < 6; i++) {

                if(hora < fatima.getHorarios()[i])){

                    System.out.println(fatima.getHorarios()[i]);
                    break;
                }


            }
        }




    }
}
