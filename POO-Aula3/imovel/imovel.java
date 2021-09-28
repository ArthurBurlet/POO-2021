package imobiliaria;

public class imovel {

	int codImovel;
	String bairro;
	String tipo;
	double valor;
	double valorreajuste;

	public void reajuste() {
		if(tipo == "casa") {
			valorreajuste = valor * 1.05;
			System.out.println(valorreajuste);
		}
		if(tipo == "apt") {
			valorreajuste = valor * 1.08;
			System.out.println(valorreajuste);
		}
	}
	
	public void categoria() {
		if(valorreajuste > 50000) {
			System.out.printf("Cateogoria A\n");
		}
		if(valorreajuste >= 10000 && valorreajuste <= 50000) {
			System.out.printf("Cateogoria B\n");
		}
		if(valorreajuste < 10000) {
			System.out.printf("Cateogoria C\n");
		}
	}
}