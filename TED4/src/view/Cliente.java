package view;
import model.*;

public class Cliente {
	
	public static void main(String[] args) {
		
		FabricaUsuario fab = new FabricaUsuario();
		Usuario a1 =  fab.getUsuario("joca", "masculino");
		Usuario a2 = fab.getUsuario("maria", "feminino");
		Usuario a3 = fab.getUsuario("jess", "indefinido");
		
		System.out.println(a1.boasVindas());
		System.out.println(a2.boasVindas());
		System.out.println(a3.boasVindas());
		
	}

}
