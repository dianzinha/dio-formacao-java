package com.br.dio_formacao_java.desafios;

import java.util.Scanner;

public class DesafioEstruturaControle {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String jogador1, jogador2;
// TODO: complete os espaços em branco com sua solução para o problema
        for (int i = 0; i < N; i++) {
            jogador1 = leitor.next();
            jogador2 = leitor.next();

            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
                System.out.println("Aniquilacao mutua");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
                System.out.println("Ambos venceram");
            else if (jogador1.equalsIgnoreCase("ataque") && !jogador2.equalsIgnoreCase("ataque"))
                System.out.println("Jogador 1 venceu");
            else if (!jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
                System.out.println("Jogador 2 venceu");
            else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel"))
                System.out.println("Jogador 1 venceu");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra"))
                System.out.println("Jogador 2 venceu");
            else System.out.println("Sem ganhador");
        }
    }
}
