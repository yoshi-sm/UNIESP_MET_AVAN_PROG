
public class Teste {
	
	public static void main(String[] args) {
		
		Cliente joca = new Cliente("joca", "000.222.111-11", 44);
		
		Fita emboscada = new Fita("Emboscada", Tipo.lancamento);
		Fita porradaria = new Fita("Porradaria", Tipo.infantil);
		Fita sempreAmor = new Fita("Sempre Amor", Tipo.normal);
		
		Aluguel a1 = new Aluguel(3, joca);
		a1.alugarFita(emboscada);
		a1.alugarFita(porradaria);
		a1.alugarFita(sempreAmor);
		
		System.out.println(joca);
		System.out.println(a1);
		
		System.out.println(a1.efetuarAluguel());
		System.out.println(joca);
	}
}
