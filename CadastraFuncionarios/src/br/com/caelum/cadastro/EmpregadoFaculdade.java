package br.com.caelum.cadastro;

class EmpregadoFaculdade {
private String nome;
private double salario;
double getGastos(){
	return this.salario;
}
String getInfo(){
	return "nome"+this.nome+"com salario"+this.salario;
}
}
