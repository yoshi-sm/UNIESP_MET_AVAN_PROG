package model;

public class UsuarioSemGenero extends Usuario {

	public UsuarioSemGenero(String nome, String genero) {
		super(nome, genero);
	}
	
	public String boasVindas() {
		
		return "Bem-vindo, " + getNome();
	}
}
