package ejemploLambda5;

public interface PruebaMethodDefault {

	void pruebaBasica();
	
	default void pruebaDefault() {
		System.out.println("Hola Mundo!");
	}
	default void pruebaDefault(String nombre) {
		System.out.println("Hola "+nombre);
	}
}
