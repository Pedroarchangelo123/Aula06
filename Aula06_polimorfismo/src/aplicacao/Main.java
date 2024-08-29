package aplicacao;
import java.util.Scanner;
	import entidade.CLT;
	import entidade.Funcionario;
	import entidade.Pessoa_Juridica;
	import entidade.enums.cargo;





public class Main {




		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			// TODO Auto-generated method stub
			
			System.out.println("Colocar o nome: ");
			String name = scn.next();
			System.out.println("Colocar seu salário");
			double salary = scn.nextDouble();
//			System.out.println("Colocar seu cargo pj ou clt");
//			String cargo = scn.next();
			
			System.out.println("Digite sua profissão [p]Professor, [C]Contador, [D]DEV: ");
			
			String choose = scn.next();
			
			if(choose.contains("p") ) {
				Pessoa_Juridica pj = new Pessoa_Juridica(name,salary,cargo.PROFESSOR);
				CLT clt = new CLT(name,salary,cargo.PROFESSOR);
				System.out.println("Clt ou Pj");
				String cargos = scn.next();			
				if(cargos.contains("Clt")) {
					System.out.println( clt + " CLT = " + clt.receber(salary));
				}else if(cargos.contains("Pj")) {
					System.out.println(pj + " = " + pj.receber1(salary));
				}
			}else if(choose.contains("c") ) {
				Funcionario funcionario = new Funcionario(name,salary,cargo.CONTADOR);
			}else if(choose.contains("d")) {
				Funcionario funcionario = new Funcionario(name,salary,cargo.DEV);
			}

			

			
			
		}

	}