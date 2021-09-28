package calculadora;

public class maincalculadora {
	public static void main(String[] args) {
		
		calculadora c = new calculadora();
		c.question();
		while(c.op != 5) {
		c.numeros();
		c.operacao();
		c.saida();
		c.entrada();
		}
		
		
	}
}