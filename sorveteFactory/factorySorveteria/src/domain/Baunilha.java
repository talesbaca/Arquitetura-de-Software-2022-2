package domain;

public class Baunilha implements Sorvete {
    private String nome = "Baunilha";
    private double preco = 12.5;    
    private boolean estaDisponivel;

    public Baunilha() {
        super();
        this.estaDisponivel = true;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }

    @Override
    public boolean estaDisponivel() {
        return this.estaDisponivel;
    }

    @Override
    public void repor() {
        this.estaDisponivel = false;
    }
}
