package poo_exercicio01;

import poo_exercicio01.model.Cliente;

public class TestaCliente {
    public static void main(String[] args){
        Cliente c01 = new Cliente(1, "Eduardo Dias", 25,"055.897.711-XX", "71.959-000");
        Cliente c02 = new Cliente(2, "Sara Azevedo", 25,"461.486.458-XX", "76.683-000");

        c01.visualizar();
        c02.visualizar();
    }
}
