package ejercicioPokemon.logica;

public class Squirtle extends Pokemon implements IAgua{

	// ESTADO: ATRIBUTOS;

	// COMPORTAMIENTO: FUNCIONES, PROCEDIMIENTOS Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;

	// MÉTODOS PROPIOS DE LA CALSE Squirtle;

	// MÉTODOS HEREDADOS DE LA SUPERCLASE Pokemon;
	@Override
	public void atacarPlacaje() {
		System.out.println("Soy squirtle y este es mi ataque placaje...");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy squirtle y este es mi ataque arañazo...");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Soy squirtle y este es mi ataque mordisco...");
	}

	// MÉTODOS IMPLEMENTADOS DE LA INTERFAZ IAgua;
	@Override
	public void atacarHidrobomba() {
		System.out.println("Soy squirtle y este es mi ataque hidrobomba...");
	}
	
	@Override
	public void atacarPistolaAgua() {
		System.out.println("Soy squirtle y este es mi ataque pistola de agua...");
	}
	
	@Override
	public void atacarBurbuja() {
		System.out.println("Soy squirtle y este es mi ataque burbuja...");
	}
	
	@Override
	public void atacarHidropulso() {
		System.out.println("Soy squirtle y este es mi ataque hidropulso...");
	}

}
