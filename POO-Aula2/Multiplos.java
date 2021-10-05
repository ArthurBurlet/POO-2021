  package Aula2;

public class MultiploDe2 {
	public void Multiplos() {
		int total = 0;
		for (int i = 0; i < 22; i++) {
			int resto = i % 2;
			if (resto == 0) {
			    System.out.println("JAVA");
			        total += 1;
			}	
		}
	System.out.println("Total: " + total);
	}
}