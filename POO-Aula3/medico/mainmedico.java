package medico;

public class mainmedico {
	public static void main(String[] args) {
	
		medico m1 = new medico(12345, "Debora", 0, 250);	
		m1.status();
		m1.pagamentoDinheiro(250);
		m1.pagamentoPlano(250);
		
		medico m2 = new medico(456789, "Sergio", 0, 300);
		m2.status();
		m2.pagamentoDinheiro(300);
		m2.pagamentoPlano(300);
		
		m1.totalMedicos();
		
	}
}