package br.com.caelum.cadastro;

import br.com.caelum.cadastro.util.Tributavel;

class SeguroDeVida implements Tributavel{
	
	
	double seguroDeVida(int valor){
		return seguroDeVida(42);
	}

	@Override
	public double calculoDeTributavel() {
		
		return 42;
	}


}
