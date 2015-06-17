package br.com.caelum.funcionario.teste;

import br.com.caelum.cadastro.util.Autenticavel;
import br.com.caelum.cadastro.Gerente;

public class TestaGerente {
	public static void main (String[]args){
		Gerente g = new Gerente();
	g.setNome("Daniel");
	g.AutenticaSenha("1234");
	g.setSalario(12000);
	g.setDia(20);
	g.setMes(8);
	g.setAno(2002);
	g.setIdade(21);
	g.setDepartamentoDeTrabalho("Escritorio");
	g.mostra();
			
			
	
			System.out.println (g.getBonificacao());
	
	}

}
