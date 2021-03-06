//import java.util.ArrayList;
//import java.util.Collection;

public class Cliente {
    private String nome;
    private String rg;
    private Integer pontosDeAlugadorFrequente;

    //private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

    public Cliente(String nome, String rg, Integer pontosDeAlugadorFrequente) {
        this.nome = nome;
        this.rg = rg;
        this.pontosDeAlugadorFrequente = pontosDeAlugadorFrequente;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    @Override
	public String toString() {
		return "Cliente [nome=" + nome + ", rg=" + rg + ", pontosDeAlugadorFrequente=" + pontosDeAlugadorFrequente
				+ "]";
	}

	public String getRg() {
    	return this.rg;
    }
    
    public void setRg(String rg) {
    	this.rg = rg;
    }

	public Integer getPontosDeAlugadorFrequente() {
		return pontosDeAlugadorFrequente;
	}

	public void setPontosDeAlugadorFrequente(Integer pontosDeAlugadorFrequente) {
		this.pontosDeAlugadorFrequente = pontosDeAlugadorFrequente;
	}
    
    

    /*public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }*/

    /*public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        for (Aluguel f : fitasAlugadas) {

            double valorCorrente = 0.0;
            Aluguel cada = f;

            // determina valores para cada linha
            // switch com enum
            switch (cada.getFita().getCodigoDePreco()) {
            case normal:
                valorCorrente += 2;
                if (cada.getDiasAlugada() > 2) {
                    valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
                }
                break;
            case lancamento:
                valorCorrente += cada.getDiasAlugada() * 3;
                break;
            case infantil:
                valorCorrente += 1.5;
                if (cada.getDiasAlugada() > 3) {
                    valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
                }
                break;
            } // switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lan??amento por pelo menos 2
            // dias
            if (cada.getFita().getCodigoDePreco() == Tipo.lancamento
                && cada.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado += "\t" + cada.getFita().getTitulo() + "\t"
                         + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        // adiciona rodap??
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
    }*/
}