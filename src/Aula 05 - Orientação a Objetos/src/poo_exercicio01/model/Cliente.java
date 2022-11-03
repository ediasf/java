//atributos do cliente: id, nome, cpf, cep, tipo
package poo_exercicio01.model;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String cep;
    private int idade;

    public Cliente(int id, String nome, int idade, String cpf, String cep) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    public void visualizar () {
        System.out.println("\n ************************");
        System.out.println("Dados do Cliente: ");
        System.out.println("\n ************************");
        System.out.println("\nID do Cliente: " + this.id);
        System.out.println("\nNome do Cliente: " + this.nome);
        System.out.println("\nNome do Cliente: " + this.idade);
        System.out.println("\nCPF do Cliente: " + this.cpf);
        System.out.println("\nCEP do Cliente: " + this.cep);

    }
}
