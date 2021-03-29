package model;

public class UsuarioHomem extends Usuario {
	
	
	public UsuarioHomem(String nome, String genero) {
		super(nome, genero);
	}
	
	public String boasVindas() {
		
		return "Bem-vindo, Sr. " + getNome();
	}
}
