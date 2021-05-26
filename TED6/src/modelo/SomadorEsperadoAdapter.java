package modelo;
import java.util.ArrayList;
import java.util.List;

public class SomadorEsperadoAdapter implements SomadorEsperado{

	private SomadorExistente somador = new SomadorExistente();

	
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		for(int elemento : vetor) {
			lista.add(elemento);
		}
		return somador.somaLista(lista);
	}

}
