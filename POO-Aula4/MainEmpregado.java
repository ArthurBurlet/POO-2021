package exercicio1;

public class MainEmpregado {
	public static void main(String[] args) {
		Empregado em1 = new Empregado("Arthur","Burlet", 1698.96);
		Empregado em2 = new Empregado("Maria","Costa",6650.25);
		Empregado em3 = new Empregado("Nicolas","Antunes",3725.69);
		
		em1.Status();
		em2.Status();
		em3.Status();
		
		em1.calculadoraImposto();
		em2.calculadoraImposto();
		em3.calculadoraImposto();

		em1.StatusDescontado();
		em2.StatusDescontado();
		em3.StatusDescontado();
}
}