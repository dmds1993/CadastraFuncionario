package br.com.caelum.cadastro;

abstract class Funcionario {
	protected int idade;
	protected String nome;
	protected String departamentoDeTrabalho;
	protected double salario;
	protected static Data dataDeEntrada = new Data();
	protected String senha;
	private String teste;
	
	public static int getIdentificador() {
		return Funcionario.getIdentificador();
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setDepartamentoDeTrabalho(String departamentoDeTrabalho) {
		this.departamentoDeTrabalho = departamentoDeTrabalho;
	}

	public void setDia(int dia) {
		this.dataDeEntrada.dia = dia;
	}

	public void setMes(int mes) {
		this.dataDeEntrada.mes = mes;
	}

	public void setAno(int ano) {
		this.dataDeEntrada.ano = ano;
	}

	abstract double getBonificacao();

	public void mostra() {
		System.out.println("Nome :" + this.nome);
		System.out.println("Salario :" + this.salario);
		System.out.println("Departamento de trabalho :"
				+ this.departamentoDeTrabalho);
		System.out.println("Idade :" + this.idade);
		System.out.println("Data de entrada:" + dataDeEntrada.formatada());
		System.out.println(this.senha);
	}

	double ganhoAnual() {
		return this.salario *= 12;
	}
}
