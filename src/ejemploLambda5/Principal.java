package ejemploLambda5;

public class Principal {

	public static void main(String[] args) {
		PruebaMethodDefault p = () -> System.out.println("Hola!");
		p.pruebaBasica();
		p.pruebaDefault();
		p.pruebaDefault("Sebastián");
		
	}

}
