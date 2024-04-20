package ejercicioPokemon.logica;

public class Balbasaur extends Pokemon implements IPlanta {

	// ESTADO: ATRIBUTOS;

	// COMPORTAMIENTO: FUNCIONES, PROCEDIMIENTOS Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);
	public Balbasaur() {
		super();
	}

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;
	public Balbasaur(int numPokedex_p, String nombrePokemon_p, double pesoPokemon_p, String sexo_p,
			int temporadaQueAparece_p, String tipo_p) {
		super(numPokedex_p, nombrePokemon_p, pesoPokemon_p, sexo_p, temporadaQueAparece_p, tipo_p);
	}

	// MÉTODOS GETTERS Y SETTERS;

	// MÉTODOS PROPIOS DE LA CLASE Balbasaur;

	// MÉTODOS HEREDADOS DE LA SUPERCLASE ABSTRACTA Pokemon;
	@Override
	public void atacarPlacaje() {
		System.out.println("Soy balbasaur y este es mi ataque placaje...");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Soy balbasaur y este es mi ataque arañazo...");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Soy balbasaur y este es mi ataque mordisco...");
	}

	// MÉTODOS ABSTRACTOS IMPLEMENTADOS DE LA INTERFAZ IPlanta;
	@Override
	public void atacarParalizar() {
		System.out.println("Soy balbasaur y este es mi ataque paralizar...");
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Soy balbasaur y este es mi ataque drenaje...");
	}

	@Override
	public void atacarHojaAfilada() {
		System.out.println("Soy balbasaur y este es mi ataque hoja afilada...");
	}

	@Override
	public void atacarLatigoCepa() {
		System.out.println("Soy balbasaur y este es mi ataque latigo cepa...");
	}
}
