package br.com.caelum.cadastro;
import br.com.caelum.cadastro.util.Autenticavel;


public class Diretor extends Funcionario implements Autenticavel{

	private String diretorSenha = "Daniel";

	public boolean AutenticaSenha( String senha){
		if (diretorSenha.equalsIgnoreCase(senha)){
			System.out.println ("Acesso liberado");
			return true;
		}else{
			System.out.println("Senha incorreta");
				return false;
		}
	}
		 


	@Override
	double getBonificacao() {
		this.salario = this.salario * 0.20;
		return this.salario;
	}




	
}
