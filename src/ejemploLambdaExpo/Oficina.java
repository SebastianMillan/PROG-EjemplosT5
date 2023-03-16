package ejemploLambdaExpo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Oficina {

	List<Empleado> lista= new ArrayList<Empleado>();

	public Oficina(List<Empleado> lista) {
		super();
		this.lista = lista;
	}

	public List<Empleado> getLista() {
		return lista;
	}
	public void setLista(List<Empleado> lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}
	
	public boolean comprobarMayoriaEdad(Empleado e) {
		int mayorEdad=60;
		Predicate<Integer> mayoria = edad -> edad > mayorEdad;
		return mayoria.test(e.getEdad());
	}
	public void imprimirLista() {
		lista.forEach(e -> System.out.println(e));
	}
	public void ordenarPorNombre() {
		lista.sort((e1,e2) -> e1.getNombre().toLowerCase().compareTo(e2.getNombre().toLowerCase()));
	}
	public void editHoras(Empleado e, double nuevasHorasTrab) {
		e.setHorasTrabajadas(nuevasHorasTrab);
	}
	public void borrar(Empleado e) {
		lista.remove(e);
	}
	//Hacer el find con stream
	public Empleado findByDNIV1(String dniBusq) {
		for(Empleado e : lista) {
			if(e.getDni().equalsIgnoreCase(dniBusq)) {
				return e;
			}
		}
		return null;
	}
	public Empleado findByDNIV2(String dniBusq) {
		return lista.stream()
			.filter(e -> e.getDni().equalsIgnoreCase(dniBusq))
			.findFirst()
			.get();
	}
	public void crear(Empleado e) {
		lista.add(e);
	}
	//Hacer este metodo con stream
	public double calcularMediaHorasTrab() {
		return 0;
	}
}
