package ejercicioPokemon;

import ejercicioPokemon.logica.Charmander;
import ejercicioPokemon.logica.Balbasaur;
import ejercicioPokemon.logica.Squirtle;
import ejercicioPokemon.logica.Pikachu;

public class Main {

	public static void main(String[] args) {

		Charmander charmander_1 = new Charmander();
		Balbasaur balbasaur_1 = new Balbasaur();
		Squirtle squirtle_1 = new Squirtle();
		Pikachu pikachu_1 = new Pikachu();

		charmander_1.atacarPlacaje();
		charmander_1.atacarAraniazo();
		charmander_1.atacarMordisco();
		charmander_1.atacarPunioFuego();
		charmander_1.atacarAscuas();
		charmander_1.atacarLanzallamas();

		System.out.println();

		balbasaur_1.atacarPlacaje();
		balbasaur_1.atacarAraniazo();
		balbasaur_1.atacarMordisco();
		balbasaur_1.atacarParalizar();
		balbasaur_1.atacarDrenaje();
		balbasaur_1.atacarHojaAfilada();
		balbasaur_1.atacarLatigoCepa();

		System.out.println();

		squirtle_1.atacarPlacaje();
		squirtle_1.atacarAraniazo();
		squirtle_1.atacarMordisco();
		squirtle_1.atacarHidrobomba();
		squirtle_1.atacarPistolaAgua();
		squirtle_1.atacarBurbuja();
		squirtle_1.atacarHidropulso();

		System.out.println();

		pikachu_1.atacarPlacaje();
		pikachu_1.atacarAraniazo();
		pikachu_1.atacarMordisco();
		pikachu_1.atacarImpacTrueno();
		pikachu_1.atacarPunioTrueno();
		pikachu_1.atacarRayo();
		pikachu_1.atacarRayoCarga();

	}

}
