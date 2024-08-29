package entidade;
import entidade.enums.cargo;

public class Funcionario {
	private String nome;
	protected double salario;
	private cargo cargo;

	
	public  double receber(double money ) {
		return money  * 0.90;
	}


public Funcionario(String nome, double salario, cargo cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}


//	public Funcionario(String nome, String salary, Cargo cargo) {
//		super();
//		this.nome = nome;
//		this.salario = salario;
//		this.cargo = cargo;
//	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + "]";
	}
	
	

}