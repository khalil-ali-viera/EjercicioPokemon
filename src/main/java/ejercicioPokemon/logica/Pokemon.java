package ejercicioPokemon.logica;

public abstract class Pokemon {

	// ESTADO: ATRIBUTOS;
	protected int numPokedex;
	protected String nombrePokemon;
	protected double pesoPokemon;
	protected String sexo;
	protected int temporadaQueAparece;
	protected String tipo;

	// COMPORTAMIENTOS: FUNCIONES, PROCEDIMIENTOS Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);
	protected Pokemon() {
	}

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;
	protected Pokemon(int numPokedex_p, String nombrePokemon_p, double pesoPokemon_p, String sexo_p,
			int temporadaQueAparece_p, String tipo_p) {
		this.numPokedex = numPokedex_p;
		this.nombrePokemon = nombrePokemon_p;
		this.pesoPokemon = pesoPokemon_p;
		this.sexo = sexo_p;
		this.temporadaQueAparece = temporadaQueAparece_p;
		this.tipo = tipo_p;
	}

	// MÉTODOS GETTERS Y SETTERS;

	public int getNumPokedex() {
		return numPokedex;
	}

	public void setNumPokedex(int numPokedex) {
		this.numPokedex = numPokedex;
	}

	public String getNombrePokemon() {
		return nombrePokemon;
	}

	public void setNombrePokemon(String nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}

	public double getPesoPokemon() {
		return pesoPokemon;
	}

	public void setPesoPokemon(double pesoPokemon) {
		this.pesoPokemon = pesoPokemon;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getTemporadaQueAparece() {
		return temporadaQueAparece;
	}

	public void setTemporadaQueAparece(int temporadaQueAparece) {
		this.temporadaQueAparece = temporadaQueAparece;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// MÉTODOS PROPIOS DE LA CLASE Pokemon;
	protected abstract void atacarPlacaje();

	protected abstract void atacarAraniazo();

	protected abstract void atacarMordisco();

}
