package com.br.dio_formacao_java.estrutura_repeticao;

public class ExemploFor {
    public static void main(String[] args) {
        System.out.println("Estrutura de repetição For");
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }
        System.out.println(" ");
        System.out.println("Estrutura de repetiçao For com arrays");
        System.out.println(" ");
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
