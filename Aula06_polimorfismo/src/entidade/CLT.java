package entidade;
import entidade.enums.cargo;
public class CLT extends Funcionario{
	public CLT(String nome, double salario, cargo cargo) {
		super(nome, salario, cargo);
		// TODO Auto-generated constructor stub
	}

	private double convenio;
	
	public double convenio1(double money) {
		convenio = money;
		return receber( convenio) ;
	}
}