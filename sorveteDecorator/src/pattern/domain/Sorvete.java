package pattern.domain;

public abstract class Sorvete {
	
	protected String detalhes = "Sorvete de 120g ";
  
	public String getDetalhes() {
		return detalhes;
	}
	
	public abstract double getPreco();
}