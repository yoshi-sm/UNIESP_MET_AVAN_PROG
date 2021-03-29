package model;

public class FabricaUsuario extends FabricaAbstrataUsuario {
	
	public FabricaUsuario() {
		
	}
	
	public Usuario getUsuario(String nome, String genero) {
		
		if (genero.equals("masculino")) {
			return new UsuarioHomem(nome, genero);
		}
		else if (genero.equals("feminino")) {
			return new UsuarioMulher(nome, genero);
		}		
		else {
			return new UsuarioSemGenero(nome, genero);
		}
	}

}
