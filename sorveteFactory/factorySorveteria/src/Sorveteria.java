import domain.Sorvete;
import factory.Factory;
import factory.IceCreamFactory;

public class SorveteApp {

	public static void main(String[] args) {
		
		//Cria a fábrica.
		Factory factory = new IceCreamFactory();
		
		//Cria um objeto sorvete.
		Sorvete sorvete = factory.makeIceCream("Flocos");
		sorvete.setNome("Flocos");
        if(!sorvete.estaDisponivel()){
            sorvete.repor();
        }
		
		System.out.println("Nome: " + sorvete.getNome());
		System.out.println("Preço: " + sorvete.getPreco());
		System.out.println("Está disponível? " + sorvete.estaDisponivel());
		
		//Verifica a classe concreta que está sendo usada.
		System.out.println("Classe: " + sorvete.getClass().getCanonicalName());

	}

}
