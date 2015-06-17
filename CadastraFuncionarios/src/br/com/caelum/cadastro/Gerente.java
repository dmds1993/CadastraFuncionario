package br.com.caelum.cadastro;

import br.com.caelum.cadastro.util.Autenticavel;



public class Gerente extends Funcionario implements Autenticavel{
int numeroDeFuncionariosGerenciados;
private String senha;

		@Override
		public double getBonificacao (){
		return this.salario *1.4 + 1000;
			}	


		@Override
		public boolean AutenticaSenha(String senha){
			if (this.senha.equalsIgnoreCase(senha)){
				System.out.println ("Acesso liberado");
				return false;
			}else{
				System.out.println("Senha incorreta");
				return true;	
			}
				
					
			}

		}

