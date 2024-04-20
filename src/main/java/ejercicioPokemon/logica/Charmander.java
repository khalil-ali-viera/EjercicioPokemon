package ejercicioPokemon.logica;

public class Charmander extends Pokemon implements IFuego {

	// ESTADO: ATRIBUTOS;

	// COMPORTAMIENTO: FUNCIONES, PROCEDIMIENTOS Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);
	public Charmander() {
		super();
	}

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;
	public Charmander(int numPokedex_p, String nombrePokemon_p, double pesoPokemon_p, String sexo_p,
			int temporadaQueAparece_p, String tipo_p) {
		super(numPokedex_p, nombrePokemon_p, pesoPokemon_p, sexo_p, temporadaQueAparece_p, tipo_p);
	}

	// MÉTODOS GETTERS Y SETTERS;

	// MÉTODOS PROPIOS DE LA CLASE Charmander;

	// MÉTODOS ABSTRACTOS HEREDADOS DE LA SUPERCLASE ABSTRACTA Pokemon;
	@Override
	public void atacarPlacaje() {
		System.out.println("Soy charmander y este es mi ataque placaje...");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy charmander y este es mi ataque arañazo...");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Soy charmander y este es mi ataque mordisco...");
	}

	// MÉTODOS ABSTRACTOS IMPLEMENTADOS DE LA INTERFAZ IFuego;
	@Override
	public void atacarPunioFuego() {
		System.out.println("Soy charmander y este es mi ataque puño de fuego");
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Soy charmander y este es mi ataque ascuas...");
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Soy charmander y este es mi ataque lanzallamas...");
	}
	
}
