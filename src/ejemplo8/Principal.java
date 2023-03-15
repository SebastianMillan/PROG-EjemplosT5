package ejemplo8;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> lista = new ArrayList<Empleado>();
		lista.add(new Empleado(1,"Manuel","Fernandez"));
		lista.add(new Empleado(2,"Alvaro","Gómez"));
		lista.add(new Empleado(3,"Carlos","Dominguez"));
		
		System.out.println("Sin ordenar");
		lista.forEach(e -> System.out.println(e));
		
		System.out.println("Ordenado alfabeticamente");
		lista.sort((e1,e2) -> e1.getNombre().toLowerCase()
				.compareTo(e2.getNombre().toLowerCase()));
		lista.forEach(e -> System.out.println(e));
	}

}
