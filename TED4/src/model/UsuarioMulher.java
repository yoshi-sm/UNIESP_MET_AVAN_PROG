package model;

public class UsuarioMulher extends Usuario{


	public UsuarioMulher(String nome, String genero) {
		super(nome, genero);
	}
	
	public String boasVindas() {
		
		return "Bem-vinda, Sra. " + getNome();
	}
	
}
