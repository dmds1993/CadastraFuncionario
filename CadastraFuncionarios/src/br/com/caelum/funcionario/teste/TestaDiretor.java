package br.com.caelum.funcionario.teste;

import br.com.caelum.cadastro.Diretor;
import br.com.caelum.cadastro.util.Autenticavel;


public class TestaDiretor {
	public static void main (String []args){
		Diretor d = new Diretor();
		Autenticavel a = new Diretor();
			
		
		a.AutenticaSenha("1234");
		d.setNome("Daniel");		
		
		
		}
	}


