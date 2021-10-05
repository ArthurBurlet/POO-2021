package Aula2;

public class CalculadoraSalario {
	public void SalarioDescontado() {
		Double salario = 10000.00;
		if(salario < 1750.81) {
			double descontado = salario * 0.92;
			System.out.println(String.format("O valor com os descontos é de R$%.2f", descontado));
		}
		else if (salario > 1751.81 && salario < 2919.72) {
			double descontado = salario * 0.91;
			System.out.println(String.format("O valor com os descontos é de R$%.2f", descontado));
		}
		else if(salario > 2919.72 && salario < 5839.45) {
			double descontado = salario * 0.90;
			System.out.println(String.format("O valor com os descontos é de R$%.2f", descontado));
		}
		else {
			double descontado = salario * 0.89;
			System.out.println(String.format("O valor com os descontos é de R$%.2f", descontado));			
		}
	}
}