package entidade;
import entidade.enums.cargo;
public class Pessoa_Juridica extends Funcionario{

	public Pessoa_Juridica (String nome, double salario, cargo cargo) {
		super(nome, salario, cargo);
		// TODO Auto-generated constructor stub
	}

	private double adicional;
	
	public  double receber1(double money ) {
		adicional = money;
		return receber(adicional) * 0.90;
	}
}