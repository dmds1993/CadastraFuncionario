package br.com.caelum.cadastro;

class Secretaria extends Funcionario {

	@Override
	double getBonificacao() {
		this.salario+= this.salario * 0.12;
		return this.salario;
	}

	
	

}
