import java.util.ArrayList;
import java.util.Collection;

public class Aluguel {
	private Collection<Fita> fitasAlugadas = new ArrayList<Fita>();
	//private Fita fita;
    private int diasAlugada;
    private Cliente cliente;

    public Aluguel(int diasAlugada, Cliente cliente) {
        this.diasAlugada = diasAlugada;
        this.cliente = cliente;
    }
    
    public void alugarFita(Fita novaFita) {
    	this.fitasAlugadas.add(novaFita);
    }

    public Collection<Fita> getFitasAlugadas(){
    	return this.fitasAlugadas;
    }

    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setDiasAlugada(int diasAlugada) {
		this.diasAlugada = diasAlugada;
	}

	public int getDiasAlugada() {
        return diasAlugada;
    }
	
	public String efetuarAluguel() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + this.cliente.getNome() + fimDeLinha;

        for (Fita f : fitasAlugadas) {

            double valorCorrente = 0.0;
            Fita cada = f;

            // determina valores para cada linha
            // switch com enum
            switch (cada.getCodigoDePreco()) {
            case normal:
                valorCorrente += 2;
                if (this.getDiasAlugada() > 2) {
                    valorCorrente += (this.getDiasAlugada() - 2) * 1.5;
                }
                break;
            case lancamento:
                valorCorrente += this.getDiasAlugada() * 3;
                break;
            case infantil:
                valorCorrente += 1.5;
                if (this.getDiasAlugada() > 3) {
                    valorCorrente += (this.getDiasAlugada() - 3) * 1.5;
                }
                break;
            } // switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2
            // dias
            if (cada.getCodigoDePreco() == Tipo.lancamento
                && this.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado += "\t" + cada.getTitulo() + "\t"
                         + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        // adiciona rodapé
        this.cliente.setPontosDeAlugadorFrequente(this.cliente.getPontosDeAlugadorFrequente() 
        		+ pontosDeAlugadorFrequente);
        
        resultado += "Valor total deste aluguel: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente. ";
        resultado += "Novo total de pontos de alugador frequente: " +
        		this.cliente.getPontosDeAlugadorFrequente();
        
        return resultado;
    }

	@Override
	public String toString() {
		return "Aluguel [fitasAlugadas=" + fitasAlugadas + ", diasAlugada=" + diasAlugada + ", cliente=" + cliente
				+ "]";
	}

}
