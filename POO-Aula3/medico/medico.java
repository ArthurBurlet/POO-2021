package medico;

public class medico {

	private int crm, salario, consulta, totalmedicos;
	private String nome;
	
	public medico(int m, String c, int d, int f) {
		this.crm = m;
		this.nome = c;
		this.salario = d;
		this.consulta = f;
	}
		
	public void pagamentoDinheiro(double consulta) {
		double pgtdinheiro = this.consulta;
		System.out.printf("Dinheiro: %s\n", pgtdinheiro);
	}
	
	public void pagamentoPlano(double consulta) {
		double pgtplano = this.consulta * 0.7;
		System.out.printf("Plano: %s\n", pgtplano);
	}
	
	public void totalMedicos() {
		this.totalmedicos = 2;
		System.out.printf("Número total de médicos: %s", totalmedicos);
	}
	
	public void status() {
		System.out.printf("CRM: %s\n", crm);
		System.out.printf("Nome: %s\n", nome);
		System.out.printf("Salário: %s\n", salario);
		System.out.printf("Preço consulta: %s\n", consulta);
	}
	
}