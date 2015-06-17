package br.com.caelum.funcionario.teste;

import br.com.caelum.cadastro.util.Autenticavel;

public class Teste2 implements Autenticavel{

	@Override
	public boolean AutenticaSenha(String senha) {
		 if (!senha.equals(senha)){
		return false;	 
		 }else{
			senha = senha;
			System.out.println ("Acesso liberado");
			return true;
		 }
		
	}

}
