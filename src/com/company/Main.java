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

        /*/-----------Cadastro(leitura dos dados)-------------

        System.out.println("\n********Preencha com seus dados*********\n");

        //recebe o nome
        System.out.println("Digite o seu nome:");
        minhaConta.setNome(s.next());

        //recebe o sobrenome
        System.out.println("Digite o seu sobrenome:");
        minhaConta.setSobreNome(s.next());

        //recebe o email
        System.out.println("Digite o seu email:");
        minhaConta.setEmail(s.next());

        //recebe o cpf
        System.out.println("Digite o seu cpf: ");
        minhaConta.setCpf(s.nextLong());

        //recebe dia
        System.out.println("Digite o dia de seu nascimento: ");
        minhaConta.setDia(s.nextInt());

        //recebe mes
        System.out.println("Digite o mês de seu nascimento: ");
        minhaConta.setMes(s.nextInt());

        //recebe ano
        System.out.println("Digite o ano de seu nascimento: ");
        minhaConta.setAno(s.nextInt());

        //recebe sexo
        System.out.println("Sexo M | F");
        minhaConta.setSexo(s.next());

        //recebe senha
        System.out.println("Digite uma senha: ");
        minhaConta.setSenha(s.next());


        //----------------Fim Cadastro---------------

        //----------------Login-------------

        System.out.println("******* Login *******\n");

        //recebe a confirmação do email
        System.out.println("Digite o email: ");
        minhaConta.setEmail2(s.next());

        //recebe a confirmação da senha
        System.out.println("Confirme a senha: ");
        minhaConta.setSenha2(s.next());


        //teste da senha
        while(!minhaConta.getSenha2().equals(minhaConta.getSenha()) ||
                !minhaConta.getEmail2().equals(minhaConta.getEmail()) ){

            System.out.println("Senha ou email não confere! Repita novamente!");

            //recebe a confirmação do email
            System.out.println("Digite o email: ");
            minhaConta.setEmail2(s.next());

            //recebe a confirmação da senha
            System.out.println("Confirme a senha: ");
            minhaConta.setSenha2(s.next());

        }

        System.out.println("\nLogin efetuado com Sucesso!\n\n\n\n");

        //----------- Fim Login ------------



        /* imprime o nome completo
        System.out.println("Nome completo: " + minhaConta.nome + " " + minhaConta.sobreNome);
        */


        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int min = data.get(Calendar.MINUTE);
        System.out.println(hora+":"+min);


        System.out.println("Digite a linha do ônibus:");
        String bus = s.next();

       if (fatima.getLinha().equals(bus)) {



            for (int i = 0; i < 6; i++) {

                if(hora < Integer.parseInt(fatima.getHorarios()[i])){

                    System.out.println(fatima.getHorarios()[i]);
                    break;
                }


            }
        }


    }
}
