package pattern;

import pattern.decorator.AmendoasDecorator;
import pattern.decorator.CaldaDecorator;
import pattern.decorator.TubetsDecorator;
import pattern.domain.Sorvete;
import pattern.domain.SorveteBaunilha;
import pattern.domain.SorveteCreme;

public class SorveteriaApp {

	public static void main(String args[]) {
		
		Sorvete sorveteBaunilha = new SorveteBaunilha();
		Sorvete sorveteBaunilhaA = new AmendoasDecorator(sorveteSimples);
        Sorvete sorveteBaunilhaAC = new CaldaDecorator(sorveteBaunilhaA);
        Sorvete sorveteBaunilhaACT = new TubetsDecorator(sorveteBaunilhaAC);

		System.out.println(sorveteBaunilhaACT.getDetalhes()); 
		System.out.println("Preço em R$ " + String.format("%.2f", sorveteBaunilhaACT.getPreco()));
		
		Sorvete sorveteCreme = new SorveteCreme();
		Sorvete sorveteCremeT = new TubetsDecorator(sorveteCreme);
		Sorvete sorveteCremeTC = new CaldaDecorator(sorveteCremeT);

		System.out.println(sorveteCremeTC.getDetalhes()); 
		System.out.println("Preço em R$ " + String.format("%.2f", sorveteCremeTC.getPreco()));
	}
}