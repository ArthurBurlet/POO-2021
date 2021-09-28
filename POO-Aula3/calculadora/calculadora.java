
package calculadora;
import java.util.Scanner;

public class calculadora {
	
	int op;
	double a, b, resultado;
	String sinal;
	
	Scanner entrada = new Scanner(System.in);
	
	public void operacao() {
		if(op == 1){
		resultado = a + b;	
		sinal = "+";
		}
		
		if(op == 2){
		resultado = a - b;
		sinal = "-";
		}
		
		if(op == 3){
		resultado = a * b;
		sinal = "*";
		}
		
		if(op == 4){
		resultado = a / b;
		sinal = "/";
		}
	}
	
	public void entrada() {
						
		System.out.println("Selecione uma operção:\n1: soma\n2: subtração\n3: multiplicação\n4: divisão\n5: sair");
		op = entrada.nextInt();
				
	}
	
	public void numeros() {
					
		System.out.println("Informe o primeiro número: ");
		a = entrada.nextInt();
		
		System.out.println("Informe o segundo número: ");
		b = entrada.nextInt();
								
	}
	
	public void saida() {
		
		System.out.printf(
				"Resuldado %s %s %s é: %s\n", a, sinal, b, resultado);
		
	}
}