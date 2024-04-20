package ejercicioPokemon.logica;

public class Pikachu extends Pokemon implements IElectrico {

	// ESTADO: ATRIBUTOS;

	// COMPORTAMIENTO: FUNCIONES, PROCEDIMIENTOS Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;

	// MÉTODOS GETTERS Y SETTERS;

	// MÉTODOS PROPIOS DE LA CLASE Pikachu;

	// MÉTODOS HEREDADOS DE LA SUPERCLASE ABSTRACTA: Pokemon;
	@Override
	public void atacarPlacaje() {
		System.out.println("Soy pikachu y este es mi ataque placaje...");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy pikachu y este es mi ataque arañazo...");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Soy pikachu y este es mi ataque mordisco...");
	}

	// MÉTODOS IMPLEMENTADOS DE LA INTERFAZ IElectrico;
	@Override
	public void atacarImpacTrueno() {
		System.out.println("Soy pikachu y este es mi ataque impac trueno...");
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Soy pikachu y este es mi ataque puño de trueno...");
	}

	@Override
	public void atacarRayo() {
		System.out.println("Soy pikachu y este es mi ataque rayo...");
	}

	@Override
	public void atacarRayoCarga() {
		System.out.println("Soy pikachu y este es mi ataque rayo carga...");
	}

}
