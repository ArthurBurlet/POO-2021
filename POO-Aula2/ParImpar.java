package Aula2;

public class ParOuImpar {
	public void QntParOuImpar() {	
		int Par = 0;
		int Impar = 0;
		for (int i = 0; i < 30; i++) {
			if (i % 2 == 0) {
				Par += 1;				
			}			
			else {
				Impar += 1;
			}
		}
		System.out.println(String.format("Entre 0 e 30 existe %d números pares e %d numeros impares", Par, Impar));
	}
}