package com.br.dio_formacao_java.desafios;

import java.util.Scanner;

public class DesafioEstruturaControle3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int qt = leitor.nextInt();

        String nome;
        int forca;

// TODO: complete os espaços em branco com sua solução para o problema

        for (int i = 0; i < qt; i++) {
            nome = leitor.next();
            //forca = leitor.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
