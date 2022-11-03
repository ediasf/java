//id, nome, cidade, cargo, salario;

package poo_exercicio02.model;

public class Funcionario {
    private int id;
    private String nome;
    private String cidade;
    private String cargo;
    private Double salario;

    public Funcionario(int id, String nome, String cidade, String cargo, Double salario) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.cargo = cargo;
        this.salario = salario;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void visualizar () {
        System.out.println("\n ************************");
        System.out.println("Dados do Funcionário: ");
        System.out.println("\n ************************");
        System.out.println("\nID do Funcionário: " + this.id);
        System.out.println("\nNome do Funcionário: " + this.nome);
        System.out.println("\nCidade do Funcionário: " + this.cidade);
        System.out.println("\nCargo do Funcionário: " + this.cargo);
        System.out.println("\nSalário do Funcionário: " + this.salario);
    }
}



