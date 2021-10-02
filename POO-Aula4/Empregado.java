package exercicio1;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Empregado (String nm, String sn, double sa) {
		this.nome = nm;
		this.sobrenome = sn;
		this.salario = sa;
	}
	public void Status() {
		System.out.println("Nome do funcionário: " + getNome());
		System.out.println("Sobrenome do funcionário: " + getSobrenome());
		System.out.printf("Salário: %.2f \n", getSalario());
	}
	public void calculadoraImposto() {
		
		if (this.salario < 1903.98  ) {
			this.salario = this.salario * 1;			
		}
		
		else if (this.salario >= 1903.98 && this.salario <= 2826.65 ) {
			this.salario = this.salario * 0.925;			
		}
		else if(this.salario >= 2826.66 && this.salario <= 3751.05 ) {
			this.salario = this.salario * 0.85;			
		}
		else if(this.salario >= 3751.06 && this.salario <= 4664.68 ) {
			this.salario = this.salario * 0.775;			
		}
		else {
			this.salario = this.salario * 0.725;			
		}
		
	}
	public void StatusDescontado() {
		System.out.println("Nome do funcionário: " + getNome());
		System.out.println("Sobrenome do funcionário: " + getSobrenome());
		System.out.printf("Salário com desconto: %.2f \n", getSalario());
	}
	
	
}