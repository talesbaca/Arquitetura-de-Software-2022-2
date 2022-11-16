package domain;

public class Flocos implements Sorvete {
    private String nome = "Flocos";
    private double preco = 9.75;    
    private boolean estaDisponivel;

    public Flocos() {
        super();
        this.estaDisponivel = false;
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
        this.estaDisponivel = true;
    }
    
}
