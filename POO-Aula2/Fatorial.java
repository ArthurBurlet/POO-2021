  
package Aula2;

public class Fatorial {
	public void fatoriais() {
	    for (int i = 1, fator = 1 ; i <=10; i++) {
		fator = fator * i;
		System.out.println("O fatorial de " + i + " é: " + fator);
	    }
	}
}