package domain;

public interface Sorvete {
	
    void setNome(String nome);
    String getNome();
    Double getPreco();
    boolean estaDisponivel();
    void repor();
    
}