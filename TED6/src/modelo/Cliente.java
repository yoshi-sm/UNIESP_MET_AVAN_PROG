package modelo;

public class Cliente {
	//private SomadorEsperado somador;
	private SomadorEsperadoAdapter somador;
	
	public Cliente() {
		this.somador = new SomadorEsperadoAdapter();
	}
	
	public void executar() {
		int[] vetor = new int[] {1,2,3,4,5,6,7,8,9,10};
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado: "+ soma);
	}
}
