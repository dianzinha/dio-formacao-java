package com.br.dio_formacao_java.estrutura_repeticao;

public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        //Forma abreviada
        for(String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
