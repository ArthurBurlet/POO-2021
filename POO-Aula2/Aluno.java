  package Aula2;

public class SituacaoAluno {
	public void Aprovacao() {
		double nota1 = 6, nota2 = 8;
		double resultado = (nota1 + nota2) / 2;
		if(resultado >= 7) {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("REPROVADO");
		}
	}
}