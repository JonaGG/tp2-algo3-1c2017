package model.atributos_de_unidad.modos;

import model.Unidad;
import model.atributos_de_unidad.Modo;

public class GokuSSJ extends Modo {

	private int velocidad = 5;

	@Override
	public boolean puedeTransformarse(Unidad u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Modo transformarA(Unidad u) {
		// TODO Excepcion para no hay mas transformaciones
		throw new RuntimeException();
	}

	@Override
	public String getNombre() {
		return "Super Saiyajin";
	}

	@Override
	public int getVelocidad() {
		return velocidad ;
	}
}

