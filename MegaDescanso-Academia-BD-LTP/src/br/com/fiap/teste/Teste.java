package br.com.fiap.teste;

import java.util.Scanner;

import br.com.fiap.beans.*;

public class Teste {
	
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		Sala sala = new Sala();
		
		System.out.println("Digite o andar da sala: ");
		byte andarSala = leia.nextByte();
		sala.setAndar(andarSala);
		System.out.println("Digite o numero da sala: ");
		int numSala = leia.nextInt();
		sala.setNum(numSala);
		System.out.println("Digite a lotação da sala: ");
		byte lotSala = leia.nextByte();
		sala.setLotacao(lotSala);
		System.out.println("Alguma observação? ");
		String obsSala = new String();
		obsSala = leia.next()+leia.nextLine();
		sala.setObs(obsSala); 
		
		Modalidade mod = new Modalidade();
		
		System.out.println("Digite o codigo da modalidade: ");
		byte codMod = leia.nextByte();
		mod.setCod(codMod);
		
		System.out.println("Digite a descrição: ");
		String descMod = new String();
		descMod = leia.next()+leia.nextLine();
		mod.setDesc(descMod);
		
		System.out.println("Digite a data de inicio: ");
		String dtInicioMod = new String();
		dtInicioMod = leia.next()+leia.nextLine();
		mod.setDtInicio(dtInicioMod);
		
		System.out.println("Digite a data de termino: ");
		String dtTermMod = new String();
		dtTermMod = leia.next()+leia.nextLine();
		mod.setDtTerm(dtTermMod);
		
		char contCad = ' ';
		
		while (contCad != 'S'){
			System.out.println("Desejar realizar o cadastro de?\nS para encerrar\nA para Aluno"
					+ "\nP para Professor\nQualquer outra letra para Medico");
			contCad = leia.next().toUpperCase().charAt(0);
			if (contCad != 'S'){
				if (contCad == 'A'){
					cadAluno();
				}
			}
			
			
		
		}
		
	}
	
	public static void cadAluno(){
		Scanner leia = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o codigo da matricula: ");
		int codMatric = leia.nextInt();
		aluno.setCodMatric(codMatric);
		
		System.out.println("Digite o cpf: ");
		long cpf = leia.nextLong();
		aluno.setCpf(cpf);
		
		System.out.println("Digite o Rg: ");
		long rg = leia.nextLong();
		aluno.setRg(rg);
		
		System.out.println("Digite a data da matricula: ");
		String dtMatric = new String();
		dtMatric = leia.next()+leia.nextLine();
		aluno.setDtMatric(dtMatric);
		
		System.out.println("Digite a data de nascimento: ");
		String dtNasc = new String();
		dtNasc = leia.next()+leia.nextLine();
		aluno.setDtNasc(dtNasc);
		
		System.out.println("Digite o e-mail: ");
		String email = new String();
		email = leia.next()+leia.nextLine();
		aluno.setEmail(email);
		
		System.out.println("Digite o endereço: ");
		Endereco end = new Endereco();
		aluno.setEndereco(end);
		
		
		
		
		
		leia.close();
	}
}
