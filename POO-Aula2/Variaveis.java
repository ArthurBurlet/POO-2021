package Aula2;

public class ExerciciosVariaveis {
	public void Imprimir() {
		Integer idade = 20;
		double altura = 1.75;
		double peso = 80.50;
		System.out.println("O funcionario Arthur tem:");
		System.out.println(String.format("Idade: %d", idade));
		System.out.println(String.format("Altura: %.2f", altura));
		System.out.println(String.format("Peso: %.1f", peso));	
		
	}
}