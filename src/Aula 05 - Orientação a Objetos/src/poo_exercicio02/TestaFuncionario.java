package poo_exercicio02;

import poo_exercicio02.model.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario f01 = new Funcionario(1, "Eduardo Dias", "Brasília", "Software Developer Júnior", 7000.0);
        Funcionario f02 = new Funcionario(2, "Lilian Muller", "São Paulo", "Software Developer Pleno", 11000.0);
        Funcionario f03 = new Funcionario(3, "Alisson Oliveira", "Manaus", "Software Developer Sênior", 15000.0);

        f01.visualizar();
        f02.visualizar();
        f03.visualizar();
    }
}
