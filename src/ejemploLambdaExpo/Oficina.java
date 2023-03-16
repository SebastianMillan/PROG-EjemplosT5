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
	public void cargarLista() {
		lista.add(new Empleado("123A", "Alexander", 21, 152));
		lista.add(new Empleado("456B", "Sebastián", 22, 96));
		lista.add(new Empleado("789C", "Angel", 46, 123));
		lista.add(new Empleado("321D", "Rafa", 69, 75));
		lista.add(new Gerente("654E","Luismi",120,200,15));
	}
	public boolean comprobarMayoriaEdad(Empleado e, int mayorQue) {
		Predicate<Integer> mayoria = edad -> edad > mayorQue;
		return mayoria.test(e.getEdad());
	}
	public void imprimirFelicitacionEdad(boolean comprobarEdad) {
		if(comprobarEdad) {
			System.out.println("¡FELICIDADES, TE QUEDAN POCOS AÑOS PARA LA JUBILACIÓN!");
		}else{
			System.out.println("Todavía es demasiado pronto, ya llegará tu hora");
		}
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
	public double calcularSueldoUnTrabajador(Empleado e, double precioHora) {
		return e.calcularSueldo(precioHora);
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
	public double calcularMediaHorasTrab() {
		IEstadistica mediaHorTrab = lista -> {
			double horasTrabTot=0.0;
			for(Empleado e : lista) {
				horasTrabTot+=e.getHorasTrabajadas();
			}
			return horasTrabTot/lista.size();
		};
		return mediaHorTrab.operacion(lista);
	}
	public double calcularGastosSueldos(double precioHora) {
		IEstadistica gastoSueldo = lista -> {
			double gastoTotal=0.0;
			for(Empleado e : lista) {
				gastoTotal+=calcularSueldoUnTrabajador(e, precioHora);
			}
			return gastoTotal;
		};
		return gastoSueldo.operacion(lista);
	}
}
