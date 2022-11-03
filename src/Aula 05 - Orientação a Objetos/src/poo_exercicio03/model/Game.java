// id, nomeJogo, anoLancamento, plataforma, preco
package poo_exercicio03.model;

public class Game {
    private int id;
    private String nomeJogo;
    private int anoLancamento;
    private String plataforma;
    private float preco;

    public Game(int id, String nomeJogo, int anoLancamento, String plataforma, float preco) {
        this.id = id;
        this.nomeJogo = nomeJogo;
        this.anoLancamento = anoLancamento;
        this.plataforma = plataforma;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void visualizar () {
        System.out.println("\n ************************");
        System.out.println("Lista de Jogos: ");
        System.out.println("\n ************************");
        System.out.println("\nID do Jogo: " + this.id);
        System.out.println("\nNome do Jogo: " + this.nomeJogo);
        System.out.println("\nAno de Lançamento: " + this.anoLancamento);
        System.out.println("\nPlataforma: " + this.plataforma);
        System.out.println("\nPreço do Jogo: " + this.preco);
    }
}