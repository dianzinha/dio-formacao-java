package com.br.dio_formacao_java.estrutura_excepcionais;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765060");
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Erro: O CEP não é válido ");
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep == null || cep.length() != 8 || !cep.matches("\\d+")) {
            throw new CepInvalidoException();
        }
        return String.format("%s-%s", cep.substring(0, 5), cep.substring(5));
    }
}
