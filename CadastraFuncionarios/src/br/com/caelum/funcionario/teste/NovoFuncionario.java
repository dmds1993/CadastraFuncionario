package br.com.caelum.funcionario.teste;

import br.com.caelum.cadastro.Diretor;

public class NovoFuncionario {

	public static void main(String[] args) {
	
		Diretor diretor = new Diretor();
		diretor.AutenticaSenha("daniel");
		diretor.setSalario(1244);
		diretor.setNome("Daniel");
		diretor.setDia(20);
		diretor.setMes(10);
		diretor.setAno(1993);
		diretor.setSenha("daniel");
		diretor.mostra();
		
		
	}

}
