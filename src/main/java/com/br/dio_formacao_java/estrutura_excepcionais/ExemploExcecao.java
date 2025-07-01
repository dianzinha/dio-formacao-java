package com.br.dio_formacao_java.estrutura_excepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            System.err.println("Erro ao converter o número: " + e.getMessage());
        } finally {
            if (valor != null) {
                System.out.println("Valor convertido: " + valor);
            } else {
                System.out.println("Não foi possível converter o valor.");
            }
        }
    }
}
